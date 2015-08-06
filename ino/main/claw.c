/*
	(c) João Carlos Pandolfi Santana
	05/08/2015

	Esta lib controla a garra presente no robo
*/

#include "claw.h"
#include <Arduino.h>
#include <Servo.h>

//constants
const int PIN_GARRA_PRINCIPAL = 7;

const int ABERTURA_DA_GARRA = 120; //graus
const int GARRA_FECHADA = 30; // graus

const int CLAW_OPEN_C = 0;
const int CLAW_CLOSE_C= 1;

const int DELAY_TO_INITIALIZE_C = 300; //ms

//Variables
Servo garra_principal;
int state_claw_c;

//setup
void clawSetup(){
	//attach pin to claw
	garra_principal.attach(PIN_GARRA_PRINCIPAL);
	delay(DELAY_TO_INITIALIZE_C);
	fechar_garra();
}

// =================== ControlFunctions ===================

//Open claw
void abrir_garra(){
	garra_principal.write(ABERTURA_DA_GARRA);
	state_claw_c = CLAW_OPEN_C;
}

//Close claw
void fechar_garra(){
	garra_principal.write(GARRA_FECHADA);
	state_claw_c = CLAW_CLOSE_C;
}

//Open claw in to determinate angle
void abrir_garra_ang(int angle){
	if(angle > ABERTURA_DA_GARRA)
		abrir_garra();
	else if(angle < GARRA_FECHADA)
		fechar_garra();
	else{
		garra_principal.write(angle);
		state_claw_c = CLAW_OPEN_C;
	}
}

// =================== Verification Functions ===================

//informate, if claw closed return true
int agarrou_objeto(){
	return state_claw_c;
}
