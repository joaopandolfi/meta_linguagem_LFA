package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public class Condicao extends Code {
    private String verificacao;

    public Condicao(){
        verificacao = "";
    }

    @Override
    public String eval() {
        return this.verificacao + "{\n" + this.codeContext + "}\n";
    }

    public void setVerif(Code verif){
        if(verif != null)
            this.verificacao = verif.eval();
    }

    public void setType(int type){
        switch (type){
            case 0:
                this.verificacao = "if(" + this.verificacao + ")";
                break;
            case 1:
                this.verificacao = "if(!" + this.verificacao + ")";
                break;
            case 2:
                this.verificacao = "else";
                break;
        }

    }

    public static Code mkCondicao(int type, Code verif, Code logica){
        Condicao c = new Condicao();
        c.setVerif(verif);
        c.setType(type);
        if(logica != null)
            c.inside(logica.eval());
        c.eval();
        return c;
    }
    public static Code mkCondicao(Code logica){
        Condicao c = new Condicao();
        c.setType(2);
        if(logica != null)
            c.inside(logica.eval());
        c.eval();
        return c;
    }
}
