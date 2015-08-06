package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public class Comando extends Code{

    private String param;

    public Comando(){
        this.param = "";
    }

    @Override
    public String eval() {
        return "m."+this.codeContext+"("+this.param+");\n";
    }

    public void setParam(String param){
        this.param = param;
    }

    public static Code mkComando(String name){
        Comando c = new Comando();
        c.inside(name.toLowerCase());
        return c;
    }

    public static Code mkComandoParam(String param, int type){
        Comando c = new Comando();

       switch (type){
           case 0:
               c.inside("andar_frente_seg");
               break;
           case 1:
               c.inside("abrir_garra_ang");
               break;
       }
        c.setParam(param);
        return c;
    }
}
