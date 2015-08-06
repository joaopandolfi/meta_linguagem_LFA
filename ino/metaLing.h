#ifndef metaLing_h
#define metaLing_h

#include "Arduino.h"
#include "lineSensor.h"
#include "motor.h"
#include "claw.h"
#include "generix.h"

class MetaLing
{
public:
	//generix
	int chegou_no_objetivo();
	int verdadeiro();
	int falso();

	//claw
	void clawSetup();

	void abrir_garra();
	void fechar_garra();
	void abrir_garra_ang(int);
	int agarrou_objeto();

	//motor
	void motorSetup();
	int esta_parado();
	int esta_andando();

	void ligar_motor_direita();
	void ligar_motor_esquerda();
	void desligar_motor_esquerda();
	void desligar_motor_direita();
	void parar();
	void andar_para_frente();
	void andar_para_tras();
	void virar_para_direita();
	void virar_para_esquerda();
	void andar_frente_seg(int);

	//line Sensor
	void sensorSetup();

	int existe_objeto_a_frente();
	int existe_objeto_a_esquerda();
	int existe_objeto_a_direita();
	int sensor_linha_esquerda_reconheceu();
	int sensor_linha_meio_reconheceu();
	int sensor_linha_direita_reconheceu();

private:
	Motor m;
	LineSensor l;
	Generix g;
	Claw c;
};

#endif