package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public class Logica extends Code {
    @Override
    public String eval() {
        return this.codeContext;
    }

    public static Code concatLogica(Code actual,Code next){
        Logica l = new Logica();
        if(actual != null)
            l.inside(actual.eval());
        l.after(next);
        return l;
    }
}
