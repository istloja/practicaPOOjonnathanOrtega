/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular_edad;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.GregorianCalendar;

/**
 *
 * @author its
 */
public class Calcular_edad {
    
    public static void main(String[] args) {
        Date fechaActual = new Date();//para saber fecha actual
        System.out.println(fechaActual);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");//para declarar la fecha en String
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la fecha en el formato yyyy-MM-dd ");
        String fecha = entrada.nextLine();
        Date fechanacimiento = null;
        try {
            fechanacimiento = formato.parse(fecha);//pasando el string a fecha
            System.out.println(fechanacimiento);
            System.out.println(fechanacimiento.after(fechaActual));//para comparar fecha 
        } catch (Exception e) {
            System.out.println(e);
            
        }
        GregorianCalendar calendario = new GregorianCalendar();//permite manejar fechas
        calendario.setTime(fechaActual);//le damops valor(fechaActual) a la variable (calendario)
        int anioactual = calendario.get(GregorianCalendar.YEAR);
        int mesactual = calendario.get(GregorianCalendar.MONTH) + 1;
        int diactual = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        GregorianCalendar calendario1 = new GregorianCalendar();
        calendario1.setTime(fechanacimiento);
        int anioac = calendario1.get(GregorianCalendar.YEAR);
        int mesac = calendario1.get(GregorianCalendar.MONTH) + 1;
        int dianac = calendario1.get(GregorianCalendar.DAY_OF_MONTH);
        //System.out.println(anioac+" "+mesac+" "+dianac);
        
        
        try {
            int A=anioactual-anioac;
            int m=mesactual-mesac;
            int d=diactual-dianac;
            System.out.println("tu edad:"+"tienes:"+A+" "+"años"+" y "+m+" "+"meses"+" y "+d+" "+"dias");
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    
}
