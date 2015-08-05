package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public class Body extends Code {

    @Override
    public String eval() {
        String saida = "";
        //Includes
        saida += "/*includes*/\n#include \"motor.c\" \n#include \"lineSensor.c\" \n#include \"generix.c\" \n#include \"claw.c\"\n";
        //Setup
        saida += "/*Setup*/\nsetup(){\nmotorSetup();\nclawSetup();\nsensorSetup();\n}\n\n";
        saida += "/*Loop*/\nloop(){\n"+ this.codeContext + "\n}";
        return saida;
    }

    public static Code mkBody(Code body){
        Body b = new Body();
        if(body != null)
            b.inside(body.eval());
        b.eval();
        return b;
    }
}
