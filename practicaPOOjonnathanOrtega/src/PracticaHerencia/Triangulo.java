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
public class Triangulo extends Cuadrado {

    public double sacararea(double base, double altura) {
        return (base*altura)/2;
    }

    public double sacarperimetro(double Lado1,double Lado2,double Lado3) {
        return Lado1 + Lado2 + Lado3;

    }
    
  }
