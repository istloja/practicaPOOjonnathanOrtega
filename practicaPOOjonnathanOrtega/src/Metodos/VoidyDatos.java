/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA12
 */
public class VoidyDatos {
    //es un metodo de tipo void que suma dos numeros y presenta el resultado
    public void sumar(int numero1, int numero2){ // recibe soa numeros de tipo entero 
        System.out.println("la sumas es"+(numero1+numero2)); // presenta el resultado en pantalla
    }
    // los metodos que devuelven dotos pueden ser de diferentes tipos como
    // int,double,String,char,boleano y7 tambien pueden ser objetos
    public int sumar1(int numero1, int numero2){
        return numero1+numero2; //devolvemos el valor
    }
    public String unirCadenas (String cadena1,String cadena2){
        return cadena1+cadena2;
    }
    public boolean iniciaSesion(String usuario, String pasword){
        boolean valor=false;
        if (usuario.equals("admin")&& pasword.equals("1234")){
            valor = true;
        }
        return valor;
        
       
    }
    public static void main(String[] args) {
        VoidyDatos objeto= new VoidyDatos(); // creamos un objeto
        objeto.sumar(10, 8); //llamamos al metodo sumar y enviamos dos numeros
        objeto.sumar(11, 23);
        objeto.sumar(20, 7);
        int resultado=objeto.sumar1(40, 10); // guatdo lo que devuelve el metodosumar1
        System.out.println("la suma es"+resultado);
        int resultado1=objeto.sumar1(50, 20);
        System.out.println(resultado1+resultado);
        String cadena=objeto.unirCadenas("hola", "mundo");
        System.out.println("la cadena unida es :"+cadena);
        boolean variableinicio=objeto.iniciaSesion("admin", "1234");
        System.out.println(variableinicio);
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese usuario");
        String u=entrada.next();
        System.out.println("ingrese contraseña");
        String pasword=entrada.next();
        boolean iniciodesecion=objeto.iniciaSesion(u, pasword);
        if(iniciodesecion){
            System.out.println("BIENVENIDO SR STARK");
        } else {
            System.out.println("pasword incorrect");
        }
        
       
    }
}
