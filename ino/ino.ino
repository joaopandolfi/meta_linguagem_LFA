/*includes*/
#include <Servo.h>
#include "metaLing.h" 
MetaLing m;
/*Setup*/
void setup(){
m.motorSetup();
m.clawSetup();
m.sensorSetup();
}

/*Loop*/
void loop(){
while(! m.chegou_no_objetivo()){
if(! m.existe_objeto_a_frente()){
m.andar_para_frente();
}
else{
m.parar();
if( m.existe_objeto_a_direita()){
m.virar_para_esquerda();
}
else{
m.virar_para_direita();
}
}

}

}
