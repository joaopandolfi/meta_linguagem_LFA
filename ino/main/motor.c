/*
	(c) João Carlos Pandolfi Santana
	05/08/2015

	Esta lib controla os servo motores presentes no robo
*/

#include <Servo.h>
#include "Arduino.h"
#include "motor.h"

//constants
const int PIN_MOTOR_ESQUERDA = 3;
const int PIN_MOTOR_DIREITA = 4;

const int STOP_MOTOR = 90;
const int L_BACK_MOTOR = 0;
const int L_FRONT_MOTOR = 180;
const int R_BACK_MOTOR = 180;
const int R_FRONT_MOTOR = 90;

const int IN_MOVIMENT_M = 1;
const int STOPED_M = 0;
const int I_DONT_KNOW_M = 2;

//Variables
Servo motorEsquerda;
Servo motorDireita;

int L_stateMoviment;
int R_stateMoviment;

//setup
void motorSetup(){
	//set pin motors
	motorEsquerda.attach(PIN_MOTOR_ESQUERDA);
	motorDireita.attach(PIN_MOTOR_DIREITA);
	//initialize motors
	motorEsquerda.write(STOP_MOTOR);
	motorDireita.write(STOP_MOTOR);
	//initialize state Moviment
	setMoviment(STOPED_M,STOPED_M);
}


// =================== ControlFunctions ===================

//Define state moviment motors
void setMoviment(int left, int rigth){
	if(left != I_DONT_KNOW_M)
		L_stateMoviment = left;

	if(rigth != I_DONT_KNOW_M)
		R_stateMoviment = rigth;
}

//Return true if robot is stoped
int esta_parado(){
	if((L_stateMoviment + R_stateMoviment) > 0)
		return 0;
	return 1;
}

//Return false if robot is in moviment
int esta_andando(){
	return L_stateMoviment + R_stateMoviment;
}

// =================== Motor Functions ===================

// #=============== Control ================


//Turn on Motors
void ligar_motor_direita(){
	motorDireita.write(R_FRONT_MOTOR);
	setMoviment(I_DONT_KNOW_M,IN_MOVIMENT_M);
}

void ligar_motor_esquerda(){
	motorEsquerda.write(L_FRONT_MOTOR);
	setMoviment(IN_MOVIMENT_M, I_DONT_KNOW_M);
}

//Turn of Motors

void desligar_motor_esquerda(){
	motorEsquerda.write(STOP_MOTOR);
	setMoviment(STOPED_M,I_DONT_KNOW_M);
}

void desligar_motor_direita(){
	motorDireita.write(STOP_MOTOR);
	setMoviment(I_DONT_KNOW_M,STOP_MOTOR);
}

// #=============== Simple Moviment ================

//turn off ours 2 motors
void parar(){
	motorDireita.write(STOP_MOTOR);
	motorEsquerda.write(STOP_MOTOR);
	setMoviment(STOPED_M,STOPED_M);
}

//move robot to front
void andar_para_frente(){
	motorDireita.write(L_FRONT_MOTOR);
	motorEsquerda.write(R_FRONT_MOTOR);
	setMoviment(IN_MOVIMENT_M,IN_MOVIMENT_M);
}

//move robot to back
void andar_para_tras(){
	motorDireita.write(L_BACK_MOTOR);
	motorDireita.write(R_BACK_MOTOR);
	setMoviment(IN_MOVIMENT_M,IN_MOVIMENT_M);
}

//turn robot to rigth
void virar_para_direita(){
	motorDireta.write(L_FRONT_MOTOR);
	motorEsquerda.write(R_BACK_MOTOR);
	setMoviment(IN_MOVIMENT_M,IN_MOVIMENT_M);
}

//turn robot to left
void virar_para_esquerda(){
	motorEsquerda.write(L_BACK_MOTOR);
	motorDireita.write(R_FRONT_MOTOR);
	setMoviment(IN_MOVIMENT_M,IN_MOVIMENT_M);
}

// #=============== Sofisticated Moviment ================

void andar_frente_seg(int seconds){
	//Convert seconds to MiliSeconds
	seconds = seconds * 1000;

	andar_para_frente();
	delay(seconds);

	parar();
}