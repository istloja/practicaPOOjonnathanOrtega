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
public class Paso2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 para sumas, 2 para restas, 3 para multiplicacion, 4 para division");
        int num = entrada.nextInt();
        switch (num) {
            case 1:
                System.out.println("ingrese un valor");
                try {
                    double valor = entrada.nextDouble();
                    System.out.println("ingres otro valor");
                    double valor1 = entrada.nextDouble();
                    double a = valor + valor1;
                    System.out.println("el resultado de la suma es" + a);
                } catch (Exception e) {
                    System.out.println("hay un error" + e);
                    System.out.println("hay un error en el tipo de variable");

                }
                break;
                
            case 2:
                 System.out.println("ingrese un valor");
                 try{
                      double valor = entrada.nextDouble();
                System.out.println("ingres otro valor");
                double valor1 = entrada.nextDouble();
                double b=valor-valor1;
                System.out.println("el resultado de la resta es"+b);
                 }catch(Exception e){
                      System.out.println("hay un error"+e);
             System.out.println("hay un error en el tipo de variable");
               
                 }
                break;
                
            case 3:
                 System.out.println("ingrese un valor");
                 try{
                      double valor = entrada.nextDouble();
                System.out.println("ingres otro valor");
                double valor1 = entrada.nextDouble();
                double c=valor*valor1;
                System.out.println("el resultado de la multiplicacion es"+c);
                 }catch(Exception e){
                      System.out.println("hay un error"+e);
             System.out.println("hay un error en el tipo de variable");
               
                 }
                break;
                
            case 4:
                 System.out.println("ingrese un valor");
                 try{
                      double valor = entrada.nextDouble();
                System.out.println("ingres otro valor");
                double valor1 = entrada.nextDouble();
                double d=valor/0;
                System.out.println("el resultado de la suma es"+d);
                 }catch(Exception e){
                      System.out.println("hay un error"+e);
             System.out.println("hay un error no hay como divid");
               
                 }
                break;
        }
    

            
    }
    
}
