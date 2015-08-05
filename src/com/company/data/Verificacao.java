package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public class Verificacao extends Code {
    @Override
    public String eval() {
        return this.codeContext+"()";
    }

    public static Code mkNotVerif(Code verif){
        Verificacao v = new Verificacao();
        v.inside("!"+verif.context());
        return v;
    }

    public static Code mkVerif(String name){
        Verificacao v = new Verificacao();
        v.inside(name.toLowerCase());
        return v;
    }
}
