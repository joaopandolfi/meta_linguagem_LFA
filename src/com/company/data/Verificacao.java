package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public class Verificacao extends Code {
    public static String operadorE = "&&";
    public static String operadorOU = "||";
    private char not =' ';

    @Override
    public String eval() {
        if(!this.codeContext.contains("m."))
            return not+"m."+this.codeContext+"()";

        return not+this.codeContext;
    }

    public void setNot(){
        not = '!';
    }

    public static Code mkNotVerif(Code verif){
        Verificacao v = new Verificacao();
        v.setNot();
        v.inside(verif.eval());
        return v;
    }

    public static Code mkVerif(String name){
        Verificacao v = new Verificacao();
        v.inside(name.toLowerCase());
        return v;
    }

    public static Code mkAndVerif(Code verif1, Code verif2){
        Verificacao v = new Verificacao();
        v.inside(verif1.eval()+operadorE+verif2.eval());
        return v;
    }

    public static Code mkOrVerif(Code verif1, Code verif2){
        Verificacao v = new Verificacao();
        v.inside(verif1.eval()+operadorOU+verif2.eval());
        return v;
    }
}
