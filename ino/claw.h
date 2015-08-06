#ifndef claw_h
#define claw_h

#include "Arduino.h"
#include "Servo.h"

class Claw
{
public:
	void clawSetup();

	void abrir_garra();
	void fechar_garra();
	void abrir_garra_ang(int);
	int agarrou_objeto();

private:

	Servo garra_principal;
	int state_claw_c;
};

#endif