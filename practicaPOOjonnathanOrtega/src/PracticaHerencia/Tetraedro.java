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
public class Tetraedro extends Figuratridimencional {

    public double calcularAREA(double lado) {
        return Math.pow(Math.sqrt(2) * lado, 2);

    }

    public double calcularVOLUMEN(double aristas) {
        return Math.pow(Math.sqrt(2) / 12 * aristas, 3);
    }
}
