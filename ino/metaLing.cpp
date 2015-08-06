#include "Arduino.h"
#include "metaling.h"

//Generix

int MetaLing::chegou_no_objetivo(){
	return g.chegou_no_objetivo();
}

int MetaLing::verdadeiro(){
	return g.verdadeiro();
}

int MetaLing::falso(){
	return g.falso();
}

//claw
void MetaLing::clawSetup(){
	c.clawSetup();
}

void MetaLing::abrir_garra(){
	c.abrir_garra();
}

void MetaLing::fechar_garra(){
	c.fechar_garra();
}

void MetaLing::abrir_garra_ang(int angle){
	c.abrir_garra_ang(angle);
}

int MetaLing::agarrou_objeto(){
	return c.agarrou_objeto();
}

//motor
void MetaLing::motorSetup(){
	m.motorSetup();
}
int MetaLing::esta_parado(){
	return	m.esta_parado();
}
int MetaLing::esta_andando(){
	return m.esta_andando();
}

void MetaLing::ligar_motor_direita(){
	m.ligar_motor_direita();
}
void MetaLing::ligar_motor_esquerda(){
	m.ligar_motor_esquerda();
}
void MetaLing::desligar_motor_esquerda(){
	m.desligar_motor_esquerda();
}
void MetaLing::desligar_motor_direita(){
	m.desligar_motor_direita();
}
void MetaLing::parar(){
	m.parar();
}
void MetaLing::andar_para_frente(){
	m.andar_para_frente();
}
void MetaLing::andar_para_tras(){
	m.andar_para_tras();
}
void MetaLing::virar_para_direita(){
	m.virar_para_direita();
}
void MetaLing::virar_para_esquerda(){
	m.virar_para_esquerda();
}
void MetaLing::andar_frente_seg(int time){
	m.andar_frente_seg(time);
}



//line Sensor
void MetaLing::sensorSetup(){
	l.sensorSetup();
}

int MetaLing::existe_objeto_a_frente(){
	return l.existe_objeto_a_frente();
}

int MetaLing::existe_objeto_a_esquerda(){
	return l.existe_objeto_a_esquerda();
}

int MetaLing::existe_objeto_a_direita(){
	return l.existe_objeto_a_direita();
}

int MetaLing::sensor_linha_esquerda_reconheceu(){
	return l.sensor_linha_esquerda_reconheceu();
}

int MetaLing::sensor_linha_meio_reconheceu(){
	return l.sensor_linha_meio_reconheceu();
}

int MetaLing::sensor_linha_direita_reconheceu(){
	return l.sensor_linha_direita_reconheceu();
}

