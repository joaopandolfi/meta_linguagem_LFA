package com.company.data;

/**
 * Created by joćocarlos on 04/08/2015.
 */
public class Body extends Code {

    @Override
    public String eval() {
        String saida = "";
        //Includes
        saida += "/*includes*/\n#include <Servo.h>\n#include \"metaLing.h\" \n";
        //Variavel
        saida+= "MetaLing m;\n";
        //Setup
        saida += "/*Setup*/\nvoid setup(){\nm.motorSetup();\nm.clawSetup();\nm.sensorSetup();\n}\n\n";
        saida += "/*Loop*/\nvoid loop(){\n"+ this.codeContext + "\n}";
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
