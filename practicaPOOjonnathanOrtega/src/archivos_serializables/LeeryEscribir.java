/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serializables;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author its
 */
public class LeeryEscribir {

    public void escribirObjeto(String direccion, Persona p1) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            escritorio.writeObject(p1);
            escritorio.close();
        } catch (Exception e) {
            System.out.println("se produjo un error en " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));// ObjectInputStream para leer 
            Object auxiliar = lector.readObject();
            Persona p1 = (Persona) auxiliar;
            System.out.println("Dueño: " + p1.getNombre() + " " + "Nombre de la mascota: " + " " + p1.getMascota().getNombre() + " " + "Su edad es: " + p1.getMascota().getEdad());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void leerLista(String url) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));//ObjectInputStreamsirve para escribir
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {//usamos un ciclo para leer los datos y para cuando salga null
                Persona p1 = (Persona) auxiliar;
                System.out.println("Dueño: " + p1.getNombre() + " " + "Nombre de la mascota: " + " " + p1.getMascota().getNombre() + " " + "Su edad es: " + p1.getMascota().getEdad());
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public List<Persona> leerPersona (String url){
         List<Persona> lista = new ArrayList<>();
        try{
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar=lector.readObject();
            while(auxiliar!=null){
                Persona p1=(Persona )auxiliar;
                lista.add(p1);
                auxiliar=lector.readObject();
            }
        }
        catch(Exception e){
            System.out.println(lista);
            System.out.println(e);
        }
       return lista;
       
        
        
    }

    public void escribirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) { //cada vez que reccorrer la lista creo un objeto de la clase persona
                escritorio.writeObject(persona);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Persona p2 = new Persona("jonathan", "ortega", 982369, 20, new Mascota("max", 5, 4));
        Persona p3 = new Persona("joel", "enriquez", 934, 19, new Mascota("scot", 5, 4));
        Persona p4 = new Persona("josue", "solano", 98234, 15, new Mascota("rebeca", 9, 4));
        Persona p5 = new Persona("jose", "ramon", 982369, 17, new Mascota("diablo", 6, 4));
        Persona p6 = new Persona("jcson", "armijos", 982369, 21, new Mascota("nose", 3, 4));
        List<Persona> Lista = new ArrayList<>();//creamos la lista para guarar objetos
        //una vez que creasmos la lista ponemos los objetos dentro de ella
        Lista.add(p2);
        Lista.add(p4);
        Lista.add(p3);
        Lista.add(p5);
        Lista.add(p6);
        int a = Lista.size();
        System.out.println(a);//obtengo el lamaño de la lista
        //for (Persona per : Lista) {//tipo-variable-lista
       //     System.out.println(per.getNombre());

       // }
        //objeto.escribirLista("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt", Lista);

        // objeto.escribirObjeto("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt", p2);
        //objeto.leerArchivo("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt");
    
   // objeto.leerLista("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt");
    List<Persona>b=objeto.leerPersona("‪C:\\Users\\jhonny\\Desktop\\ejemplo.txt");
    for (Persona persona:b){
        System.out.println("la edad es:"+persona.getEdad());
    }
    }
}
