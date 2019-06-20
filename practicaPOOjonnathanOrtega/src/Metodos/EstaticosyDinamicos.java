/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author ISTLOJA12
 */
public class EstaticosyDinamicos {
    public static void main(String[] args) {
        saludar(); //para llamr un metodo estatico
        //si quiero llamar o despedir debo crear un objeto
        EstaticosyDinamicos objeto = new EstaticosyDinamicos(); //creo un objeto
        objeto.despedir();
    }
    public static void saludar(){ //este es un metodo estatico
        System.out.println("hola");
    }
    public void despedir(){ // este es un metodo NO estatico 
        System.out.println("chao");
    }
}
