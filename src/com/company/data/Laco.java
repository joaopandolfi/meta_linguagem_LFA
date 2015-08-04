package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */


public class Laco extends Code {
    public enum TypeLaco{ WHILE, FOR}
    private String condition;

    public Laco(){
        this.condition = "";
    }

    @Override
    public String eval() {
        return this.condition+ "{\n" + this.codeContext + "\n}\n";
    }

    public void setType(TypeLaco type){
        switch (type){
            case WHILE:
                this.condition = "while("+ this.condition + ")";
                break;
            case FOR:
                this.condition = "for(int i = 0; i < "+ this.condition + "; i++)";
                break;
        }
    }

    public void setVerif(String verif){
        this.condition = verif;
    }

    public static Code mkEnquanto(Code condition,Code logica){
        Laco l = new Laco();
        if(condition != null)
            l.setVerif(condition.eval());
        l.setType(TypeLaco.WHILE);
        if(logica != null)
            l.inside(logica.eval());
        return l;
    }

    public static Code mkFor(String condition,Code logica){
        Laco l = new Laco();
        l.setVerif(condition);
        l.setType(TypeLaco.FOR);
        if(logica != null)
            l.inside(logica.eval());
        return l;
    }
}
