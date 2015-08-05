/*includes*/
#include "motor.c" 
#include "lineSensor.c" 
#include "generix.c" 
#include "claw.c"
/*Setup*/
setup(){
motorSetup();
clawSetup();
sensorSetup();
}

/*Loop*/
loop(){
if(!existe_objeto_a_esquerda()){
parar();
}
if(!falso()){
parar();
}
if(verdadeiro()){
}
while(verdadeiro()){
parar();

}
for(int i = 0; i < 10; i++){

}

}
