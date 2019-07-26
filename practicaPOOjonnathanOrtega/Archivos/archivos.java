/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author ISTLOJA12
 */
public class archivos {
//    public static void main(String[] args) {
//        File archivo=new File("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt");// crear un objeto de la clase 
////se utiliza para localizar        
////en las comillas va el nombre del archivo y direccion
//        System.out.println(archivo.exists());
//        System.out.println(archivo.isDirectory()); //para saber si es una carpeta o no
//        System.out.println(archivo.isFile()); // para saber si es archivo o no 
//        System.out.println(archivo.isHidden());//para saber si esta oculto o no 
//        System.out.println(archivo.lastModified());//saber la ultima modificacio
//        archivo.delete(); //no poner el disco loca c se borra todo
//        
//        File carpeta =new File("C:\\Users\\ISTLOJA12\\Desktop/");//nuevo objeto
//        String [] arregloarchivos=carpeta.list();//arreglo es un conjunto de archivos de una carpeta
//        for (int i = 0; i < arregloarchivos.length; i++) { //para saber las carpetas que tenemos en la ubicacion establecida
//        System.out.println(arregloarchivos[i]);
//                
//            }
//    }
    public static void main(String[] args) {
        archivos objeto=new archivos();
        Scanner entrada =new Scanner (System.in);
        String hola=entrada.nextLine();
        objeto.leerArchivo("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt");
        objeto.ecribirArchivo("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt", hola);
        
    }
    public void leerArchivo(String direccion){
        File archivo =new File(direccion);
        try {
            FileReader reader=new FileReader(archivo); //convierte el archivo en objeto
            BufferedReader recorrido =new BufferedReader(reader);
            String linea;
            while ((linea =recorrido.readLine())!=null){
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println(e);//ghf
        }
    }
     public void ecribirArchivo(String direccion, String texto) {
        try {
            FileWriter archivo = new FileWriter(direccion);
            PrintWriter escribir =new PrintWriter(archivo);
            
            escribir.println(texto);
            archivo.close();
        } catch (Exception e) {
            System.out.println(e);//jjjj
        }
       
    }
     
}

