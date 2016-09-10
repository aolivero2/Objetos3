/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SERVIDOR
 */
public class NumComplejos {
    private int numreal;
    private int numing;
    
    public NumComplejos (int nreal, int nimg){
       this.numreal = nreal;
       this.numing = nimg;
    }

    public int getNumreal() {
        return numreal;
    }

    public void setNumreal(int numreal) {
        this.numreal = numreal;
    }

    public int getNuming() {
        return numing;
    }

    public void setNuming(int numing) {
        this.numing = numing;
    }
    

    
    public NumComplejos suma (NumComplejos op){
        NumComplejos c;
        int nr,ni;
        nr=(this.numreal + op.numreal);
        ni =(this.numing + op.numing);
        c = new NumComplejos (nr,ni);
        return c;
    }
    public NumComplejos resta (NumComplejos op){
        NumComplejos c;
        int nr,ni;
        nr=(this.numreal - op.numreal);
        ni=(this.numing - op.numing);
        c = new NumComplejos (nr,ni);
        return c;
    }
    public NumComplejos multiplicacion (NumComplejos op){
        NumComplejos c;
        int nr,ni;
        nr=(this.numreal*op.numreal)-(this.numing*op.numing);
        ni=(this.numreal*op.numing)+(this.numing*op.numreal);
        c = new NumComplejos (nr,ni);
        return c;
    }
}
