/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaHerencia;

/**
 *
 * @author ISTLOJA12
 */
public class Circulo extends Figuratridimencional {
    public double calculararea(double radio){
        return Math.PI * Math.pow(radio,2);
        
    }
    public double calcularperimetro(double radio){
        return 2*Math.PI*radio;
    }
}
