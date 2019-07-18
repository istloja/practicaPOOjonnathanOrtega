/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ISTLOJA12
 */
public class Aves extends Animal{
  private int numerodeHuveos;
  private boolean vuelan;

    public Aves() {
    }

    public Aves(int numerodeHuveos, boolean vuelan, String nombre, int edad, double peso, String color, double altura) {
        super(nombre, edad, peso, color, altura);
        this.numerodeHuveos = numerodeHuveos;
        this.vuelan = vuelan;
    }
  
  
  

    public int getNumerodeHuveos() {
        return numerodeHuveos;
    }

    public void setNumerodeHuveos(int numerodeHuveos) {
        this.numerodeHuveos = numerodeHuveos;
    }

    public boolean isVuelan() {
        return vuelan;
    }

    public void setVuelan(boolean vuelan) {
        this.vuelan = vuelan;
    }
  
}
