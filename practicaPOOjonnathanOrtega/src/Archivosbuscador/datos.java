/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivosbuscador;
import java.io.*;

/**
 *
 * @author jhonny
 */
public class datos {
    public static void main(String[] args) {
        try{
        FileWriter fichero=new FileWriter ("HOJA.txt");    
            fichero.write("Nombres: Jonnathan Joel");
            fichero.write(" Apellido: Ortega ");
            fichero.write(" Edad: 20 años");
            fichero.write(" Cedula: 0106154529");
            fichero.write(" Fecha de nacimiento: 02/16/1999");
            fichero.write(" Estado Civil: soltero");
            fichero.close();
        }catch(Exception ex){ex.printStackTrace();}
        
                }
    }
    

