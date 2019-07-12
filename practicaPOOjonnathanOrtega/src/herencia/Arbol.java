/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author its
 */
public class Arbol {
    public static void main(String[] args) {
        Hijo hijo = new Hijo();
        Madre madre = new Madre();
        Padre padre = new Padre();
        hijo.setPadre(padre);
        hijo.setMadre(madre);
        madre.setHijo(hijo);
        padre.setHijo(hijo);
        System.out.println("nombre de la madre es : "+hijo.getMadre().getNombre());
        System.out.println("nombre del hijo de :"+madre.getNombre()+" es "+madre.getHijo().getNombre());
        System.out.println("nombre del hijo de :"+padre.getNombre()+" es "+madre.getHijo().getNombre());
        System.out.println("el nombre de mi madre es :"+madre.getNombre());
        System.out.println("el apellido de mi madre es ;"+madre.getApellido());
        System.out.println("el apellido de mi padre es :"+padre.getApellido());
        System.out.println("la edad de mi padre es :"+padre.getEdad());
        System.out.println("la edad del hijo de :"+madre.getNombre()+" es "+madre.getHijo().getEdad());
        
    }

}
