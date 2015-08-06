#ifndef Motor_h
#define Motor_h

#include "Arduino.h"
#include "Servo.h"
class Motor
{
public:
	
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

private:

Servo motorEsquerda;
Servo motorDireita;

int L_stateMoviment;
int R_stateMoviment;
	void setMoviment(int, int);
	
};

#endif
