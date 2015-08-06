/*
	(c) João Carlos Pandolfi Santana
	05/08/2015

	Esta lib controla os sensores presentes no robo
*/
#include "lineSensor.h"
//constants
//[PINS]
#define PIN_SENSOR_LINHA_ESQUERDA  0
#define PIN_SENSOR_LINHA_MEIO  1
#define PIN_SENSOR_LINHA_DIREITA 2

#define PIN_PROXIMIDADE_ULTRASSOM_CONTROLE 9 //trigger -> send pulse to generate request
#define PIN_PROXIMIDADE_ULTRASSOM_ESQUERDA 10
#define PIN_PROXIMIDADE_ULTRASSOM_MEIO 11
#define PIN_PROXIMIDADE_ULTRASSOM_DIREITA 12

//[CALIBRATION - LINE_SENSOR]
#define SENSIBILITY 200 // 0 - 1023
#define DELAY_TO_READ 20 //ms

//[CALIBRATION - PROXIMITY_SENSOR]
#define MIN_DISTANCE_TO_RECOGNIZE 15 //cm 

//variables

//setup
void LineSensor::sensorSetup(){
	//calibrate line sensors
	first_read_MIDLE_s = readMidleSensor();
	first_read_RIGHT_s = readRigthSensor();
	first_read_LEFT_s = readLetfSensor();
	//define pinmodes
	pinMode(PIN_PROXIMIDADE_ULTRASSOM_CONTROLE,OUTPUT);
	pinMode(PIN_PROXIMIDADE_ULTRASSOM_ESQUERDA,INPUT);
	pinMode(PIN_PROXIMIDADE_ULTRASSOM_MEIO,INPUT);
	pinMode(PIN_PROXIMIDADE_ULTRASSOM_DIREITA,INPUT);
}

// =================== ControlFunctions ===================

// #=============== Read Sensors ================

//read value to left line sensor
int LineSensor::readLetfSensor(){
	delay(DELAY_TO_READ);
	return analogRead(PIN_SENSOR_LINHA_ESQUERDA);
}

//read value to midle line sensor
int LineSensor::readMidleSensor(){
	delay(DELAY_TO_READ);
	return analogRead(PIN_SENSOR_LINHA_MEIO);
}

//read value to right line sensor
int LineSensor::readRigthSensor(){
	delay(DELAY_TO_READ);
	return analogRead(PIN_SENSOR_LINHA_DIREITA);
}

// #=============== Math Functions ================

//calc subtration module
int LineSensor::module(int a , int b){
	if(a>b)
		return a-b;

	return b-a;
}

// #=============== Control ================

//Calc distance to sensor
long LineSensor::calcDistance(int pin){
	digitalWrite(PIN_PROXIMIDADE_ULTRASSOM_CONTROLE, LOW);  
    delayMicroseconds(2);  
    digitalWrite(PIN_PROXIMIDADE_ULTRASSOM_CONTROLE, HIGH);  
    delayMicroseconds(10);  
    digitalWrite(PIN_PROXIMIDADE_ULTRASSOM_CONTROLE, LOW);  
    long duration = pulseIn(pin,HIGH);  
    return  (duration /29) / 2 ;  
}

// =================== Line Sensors Functions ===================

//recognize black line in rigth sensor
int LineSensor::sensor_linha_direita_reconheceu(){
	return (module(readRigthSensor(),first_read_RIGHT_s) > SENSIBILITY);
}

//recognize black line in midle sensor
int LineSensor::sensor_linha_meio_reconheceu(){
	return (module(readMidleSensor(),first_read_MIDLE_s) > SENSIBILITY);
}

//recognize black line in left sensor
int LineSensor::sensor_linha_esquerda_reconheceu(){
	return (module(readLetfSensor(),first_read_LEFT_s) > SENSIBILITY);
}

// =================== Proximity Sensors Functions ===================

//return true if exist object in right side
int LineSensor::existe_objeto_a_direita(){
	return (calcDistance(PIN_SENSOR_LINHA_DIREITA) <= MIN_DISTANCE_TO_RECOGNIZE);
}

//return true if exist object in left side
int LineSensor::existe_objeto_a_esquerda(){
	return (calcDistance(PIN_SENSOR_LINHA_ESQUERDA) <= MIN_DISTANCE_TO_RECOGNIZE);	
}

//return true if exist object in front
int LineSensor::existe_objeto_a_frente(){
		return (calcDistance(PIN_SENSOR_LINHA_MEIO) <= MIN_DISTANCE_TO_RECOGNIZE);
}
