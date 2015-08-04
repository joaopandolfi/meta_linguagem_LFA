package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public class Body extends Code {

    @Override
    public String eval() {
        String saida = "";
        saida = "main(){\n"+ this.codeContext + "\n}";
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
