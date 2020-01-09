/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Abstractas_interface;

/**
 *
 * @author ISTLOJA12
 */
public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        Bicicleta b = new Bicicleta();
        
        c.avanza();
        b.avanza();
        c.detiene();
        b.detiene();
        b.sentarse();
        
    }
    
}
