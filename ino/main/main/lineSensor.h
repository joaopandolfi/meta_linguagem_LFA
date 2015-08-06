#ifndef lineSensor_h
#define lineSensor_h

#include "Arduino.h"

class LineSensor
{
public:
	void sensorSetup();

	int existe_objeto_a_frente();
	int existe_objeto_a_esquerda();
	int existe_objeto_a_direita();
	int sensor_linha_esquerda_reconheceu();
	int sensor_linha_meio_reconheceu();
	int sensor_linha_direita_reconheceu();

private:

	int first_read_LEFT_s;
	int first_read_RIGHT_s;
	int first_read_MIDLE_s;

	int readRigthSensor();
	int readMidleSensor();
	int readLetfSensor();
	int module(int,int);
	long calcDistance(int);
};

#endif