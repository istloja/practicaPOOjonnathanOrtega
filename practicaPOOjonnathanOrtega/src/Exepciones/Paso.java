/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA12
 */
public class Paso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num=0;
        try{//ponemos el codigo qu equeremos proteger
           num = entrada.nextInt();
        }catch(Exception e){//ponemos la ecxption al acamptura
            System.out.println("se genero el error en"+e);
            System.out.println("digite bien el tipo correcto de la variable");
            
        }
         System.out.println("el numero ingresado es " + num);
         try{
         int result=num/0;
         System.out.println(result);
         }catch(Exception e){
             System.out.println("hay un error"+e);
             System.out.println("no se puede dividir para cero dijite bien");
         }
         
    }

}
