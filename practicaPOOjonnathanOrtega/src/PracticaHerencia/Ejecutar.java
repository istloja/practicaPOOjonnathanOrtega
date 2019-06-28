/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaHerencia;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA12
 */
public class Ejecutar {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        System.out.println("Ingrese 1-circulo,Ingrese 2-cuadrado,Ingrese 3-triangulo Ingrese 4-cubo Ingrese 5-esfera Ingrese 6-tetraedro ");
        int Num= entrada.nextInt();
        switch (Num){    //para un numero determinado      es para cualquier variable 
            case 1:   //identificar el valor 
                System.out.println("ingrese el radio del circulo");
                double radio=entrada.nextDouble();
                Circulo objeto=new Circulo();
                double areacirculo=objeto.calculararea(radio);
                double perimetrocirculo=objeto.calcularperimetro(radio);
                System.out.println("el ares es "+areacirculo+"el perimetrioes "+perimetrocirculo);
                break;  //para pausar y salir de la funcion va despues de un case 
            case 2:
                System.out.println("ingrese el lado");
                double lado=entrada.nextDouble();
                Cuadrado objeto2=new Cuadrado();
                double calcularArea=objeto2.calcularArea(lado);
                double calcularPerimetro=objeto2.calcularPerimetro(lado);
                System.out.println("el area del cuadrado es "+calcularArea+"el perimetro del cuadradoes"+calcularPerimetro);
                break;
            case 3:
                System.out.println("ingres valor para el area");
                double base=entrada.nextDouble();
                double altura=entrada.nextDouble();
                System.out.println("ingrese valor para el perimetro");
                double Lado1=entrada.nextDouble();
                double Lado2=entrada.nextDouble();
                double Lado3=entrada.nextDouble();
                Triangulo objeto3=new Triangulo();
                
                double sacararea=objeto3.sacararea(base, altura);
                double sacarperimetro=objeto3.sacarperimetro(Lado1, Lado2, Lado3);
                System.out.println("el area del triangulo es "+sacararea+"el perimetro del triangulo es"+sacarperimetro);
                break;
            case 4:
                System.out.println("ingrese la longitud del cubo");
                 double cubo=entrada.nextDouble();
                 System.out.println("ingrese el volumen");
                 double volumen=entrada.nextDouble();
                Cubo objeto4 = new Cubo();
                double calcularlongitud=objeto4.calcularlongitudcubo(cubo);
                        
                double calcularvolumencubo=objeto4.calcularvolumencubo(volumen);
                System.out.println("longitud"+calcularlongitud+"volumen"+calcularvolumencubo);
                break;
            case 5:
                System.out.println("ingrese el radio para la esfera");
                double radioes=entrada.nextDouble();
                
                
               
                 Esfera objeto5 = new Esfera();
                 
                double calcularradio=objeto5.calcularRadio(radioes);
                double calcularvolumen=objeto5.calcularVolumen(radioes);
                System.out.println("radio"+calcularradio+"volumen"+calcularvolumen);
                break;
            default:   //no escojemos nimgun valor 
                System.out.println("ingrese un numero correcto");
                break;
            
        }
        
    }
    
}
