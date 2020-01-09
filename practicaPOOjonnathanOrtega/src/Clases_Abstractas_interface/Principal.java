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
public class Principal {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHerbivoro animalH = new AnimalHerbivoro();
        
        planta.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
    }
    
}
