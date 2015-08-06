package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public class Verificacao extends Code {
    static boolean not = false;

    @Override
    public String eval() {
        if(not)
            return "!m."+this.codeContext+"()";
        return "m."+this.codeContext+"()";
    }

    public static Code mkNotVerif(Code verif){
        Verificacao v = new Verificacao();
        not = true;
        v.inside(verif.context());
        return v;
    }

    public static Code mkVerif(String name){
        Verificacao v = new Verificacao();
        v.inside(name.toLowerCase());
        return v;
    }
}
