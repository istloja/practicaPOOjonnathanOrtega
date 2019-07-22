/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivosbuscador;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ISTLOJA12
 */
public class archivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 paara numero de archivos, 2 para imajenes, 3 para musica, 4 para videos, 5 para abrir NetBeans");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                File carpeta = new File("\\Users\\ISTLOJA12\\Documents/");//nuevo objeto
                String[] arregloarchivos = carpeta.list();//arreglo es un conjunto de archivos de una carpeta
                for (int i = 0; i < arregloarchivos.length; i++) { //para saber las carpetas que tenemos en la ubicacion establecida
                    System.out.println(arregloarchivos[i]);
                }
            case 2:
                File carpeta1 = new File("\\Users\\ISTLOJA12\\Pictures/");//nuevo objeto   AGREGAR SU LOCALIZACION
                String[] arregloarchivos1 = carpeta1.list();//arreglo es un conjunto de archivos de una carpeta
                for (int i = 0; i < arregloarchivos1.length; i++) { //para saber las carpetas que tenemos en la ubicacion establecida
                    System.out.println(arregloarchivos1[i]);
                }
            case 3:
                File carpeta2 = new File("\\Users\\ISTLOJA12\\Music/");//nuevo objeto
                String[] arregloarchivos2 = carpeta2.list();//arreglo es un conjunto de archivos de una carpeta
                for (int i = 0; i < arregloarchivos2.length; i++) { //para saber las carpetas que tenemos en la ubicacion establecida
                    System.out.println(arregloarchivos2[i]);
                }
            case 4:
                File carpeta3 = new File("\\Users\\ISTLOJA12\\Videos/");//nuevo objeto
                String[] arregloarchivos3 = carpeta3.list();//arreglo es un conjunto de archivos de una carpeta
                for (int i = 0; i < arregloarchivos3.length; i++) { //para saber las carpetas que tenemos en la ubicacion establecida
                    System.out.println(arregloarchivos3[i]);
                }
            case 5:
                File carpeta4 = new File("C:\\Users\\ISTLOJA12\\Documents/");//nuevo objeto
                String[] arregloarchivos4 = carpeta4.list();//arreglo es un conjunto de archivos de una carpeta
                for (int i = 0; i < arregloarchivos4.length; i++) { //para saber las carpetas que tenemos en la ubicacion establecida
                    System.out.println(arregloarchivos4[i]);
                }
            
        }

    }
}