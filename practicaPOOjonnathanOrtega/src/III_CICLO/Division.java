/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package III_CICLO;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA12
 */
public class Division {
    private double dividendo,divisor;

    public Division(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public Division() {
    }
    

  

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }
    
   public void leer(){
       Scanner entrada = new Scanner(System.in);
       System.out.println("ingrese valores");
       setDividendo(entrada.nextDouble());
       setDivisor(entrada.nextDouble());
   }
   public void Dividir(){
       double resultado;
       boolean correcto;
       correcto =false;
       do{
           try {
               leer();
               resultado=dividendo/divisor;
               System.out.println("hecho"+resultado);
               correcto=true;
           } catch (Exception e) {
               System.out.println("no se puede dividir para letras o 0"+e);
           }
       }while(!correcto);
   }
}
