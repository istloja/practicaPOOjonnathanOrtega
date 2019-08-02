/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberMetodos;

import java.util.Scanner;

/**
 *
 * @author jhonny
 */
public class ejecutarmayu {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese  el texto");
        String texto = entrada.nextLine();//  leo
        
        ejecutarmayu objeto = new ejecutarmayu();//creo un objeto

        String ar = objeto.mayusculaAminiscula(texto);// llamo al metodo
        
        ejecutarmayu objeto1=new ejecutarmayu();
        String er=objeto1.minuculaAmayuscula(texto);
        
      
        
        
       }

    private String mayusculaAminiscula(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String minuculaAmayuscula(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
