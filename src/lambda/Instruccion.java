/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author HectorJavier
 */
public class Instruccion {
    private boolean selec;
    private String accion;
    private String variable;
    private int renglon;

    public Instruccion(String accion, String variable, int renglon) {
        this.accion = accion;
        this.variable = variable;
        this.renglon = renglon;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public int getRenglon() {
        return renglon;
    }

    public void setRenglon(int renglon) {
        this.renglon = renglon;
    }

    public boolean isSelec() {
        return selec;
    }

    public void setSelec(boolean selec) {
        this.selec = selec;
    }

    @Override
    public String toString() {
        return this.selec ? "*:"+this.accion+" "+this.variable+" "+this.renglon:" :"+this.accion+" "+this.variable+" "+this.renglon;
    }
}
