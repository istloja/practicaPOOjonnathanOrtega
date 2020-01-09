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
public class Bicicleta implements Rueda,Silla{

    public void bicicleta(){
        
    }
    @Override
    public void avanza() {
        System.out.println("la bicicleta avanza");
    }

    @Override
    public void detiene() {
        System.out.println("la bicicleta se detiene");
    }

    @Override
    public void sentarse() {
        System.out.println("sentarse");  
    }

  
    
    
}
