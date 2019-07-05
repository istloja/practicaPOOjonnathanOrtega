/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasSwitch;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA12
 */
public class EjecuciondeFormulas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para km a m, ingrese 2 para m a klm , ingrese 3 para millas a m,"
                + " ingrese 4 para metros a millas, ingrese 5 para pies a metros e ingrese 6 metros a pies  ");
        int num = entrada.nextInt();
        switch (num) {
            case 1:
                System.out.println("ingrese el valor en metros");
                double valor = entrada.nextDouble();

                Formulas objeto = new Formulas();

                double kilom = objeto.km(valor);

                System.out.println("estos son los metros" + kilom);
                break;

            case 2:
                System.out.println("ingrese el valor en km");
                double valor1 = entrada.nextDouble();

                Formulas objeto1 = new Formulas();

                double metros = objeto1.m(valor1);

                System.out.println("estos son los kilometros" + metros);
                break;

            case 3:
                System.out.println("ingrese el valor en m");
                double valor2 = entrada.nextDouble();

                Formulas objeto2 = new Formulas();

                double milla = objeto2.metromilla(valor2);

                System.out.println("estos son las millas" + milla);
                break;

            case 4:
                System.out.println("ingrese el valor en metros");
                double valor3 = entrada.nextDouble();

                Formulas objeto3 = new Formulas();

                double metro = objeto3.millametro(valor3);

                System.out.println("estos son las millas" + metro);
                break;
            case 5:
                System.out.println("ingrese el valor en metros");
                double valor4 = entrada.nextDouble();

                Formulas objeto4 = new Formulas();

                double pie = objeto4.piesmetro(valor4);

                System.out.println("estos son las millas" + pie);
                break;

            case 6:
                System.out.println("ingrese el valor en metros");
                double valor5 = entrada.nextDouble();

                Formulas objeto5 = new Formulas();

                double met = objeto5.metropies(valor5);

                System.out.println("estos son las millas" + met);
                break;

        }
    }
    
}
