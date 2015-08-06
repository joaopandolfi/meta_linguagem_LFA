/*includes*/#include <Servo.h>

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
while(!m.verdadeiro()){
m.parar();

}
for(int i = 0; i < 10; i++){
m.abrir_garra_ang(15);

}

}
