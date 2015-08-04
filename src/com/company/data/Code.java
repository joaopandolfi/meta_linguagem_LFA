package com.company.data;

/**
 * Created by joãocarlos on 04/08/2015.
 */
public abstract class Code {
    protected String codeContext = "";

    public abstract String eval();

    public String after(Code code) {
        if(code != null)
            this.codeContext+= code.eval();
        return codeContext;
    }

    public void inside(String code) {
       this.codeContext = code;
    }

    public String context() {
        return codeContext;
    }
}
