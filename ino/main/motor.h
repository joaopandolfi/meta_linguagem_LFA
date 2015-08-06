#ifndef Motor_h
#define Motor_h

#include "Arduino.h"

class Motor
{
public:
	Motor();
	
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
	void andar_frente_seg();

private:
	void setMoviment();
	
};

#endif