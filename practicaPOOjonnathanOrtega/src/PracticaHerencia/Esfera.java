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
public class Esfera extends Figuratridimencional {

    public double calcularRadio(double radioes) {
        return (radioes * radioes * radioes);

    }

    public double calcularVolumen(double radioes) {
        return 4 / 3 * Math.PI * radioes;
    }
}
