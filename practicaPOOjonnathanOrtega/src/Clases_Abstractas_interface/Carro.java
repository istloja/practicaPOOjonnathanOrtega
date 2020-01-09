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
public class Carro implements Rueda{
    public Carro(){
        
    }

    @Override
    public void avanza() {
        System.out.println("el carro avanza");
    }

    @Override
    public void detiene() {
        System.out.println("el carro se detiene");
    }
    
}
