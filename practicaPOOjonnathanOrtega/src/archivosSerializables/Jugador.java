/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import archivos_serializables.Persona;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA12
 */
public class Jugador implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private int numerodegoles;
    private int añodedebut;
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int numerodegoles, int añodedebut, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numerodegoles = numerodegoles;
        this.añodedebut = añodedebut;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumerodegoles() {
        return numerodegoles;
    }

    public void setNumerodegoles(int numerodegoles) {
        this.numerodegoles = numerodegoles;
    }

    public int getAñodedebut() {
        return añodedebut;
    }

    public void setAñodedebut(int añodedebut) {
        this.añodedebut = añodedebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<Jugador> leerJugador(String direccion) {
        List<Jugador> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador objeto = (Jugador) auxiliar;
                lista.add(objeto);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public void LeerLista(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador objeto = (Jugador) auxiliar;
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int mayorEdad(List<Jugador> lista) {
        int edadmaxima=lista.get(0).getEdad();

        for (Jugador jugador : lista) {
            if (jugador.getEdad() > edadmaxima) {
                edadmaxima=jugador.getEdad();
            } 
     
        }
        return edadmaxima;

    }

    public int menorEdad(List<Jugador> lista) {
        int edadminima = 27;

        for (Jugador jugador : lista) {
            if (jugador.getEdad() > edadminima) {
                System.out.println(" no joven ");
            } else {
                System.out.println(" es joven ");
            }
        }
        return edad;

    }

    public int numeroGoles(List<Jugador> lista, String nombre) {
        int goles = 600;

        for (Jugador jugador : lista) {
            if (jugador.getNumerodegoles() < goles) {
                System.out.println(jugador.getNombre() + " menor goles");
            } else {
                System.out.println("mas goles ");
            }
        }
        return edad;

    }

    public void EscribirLista(String direccion, List<Jugador> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            //recorrer una lista y por cada vez que recorre se crea un objeto de la clase persona
            for (Jugador jugador : lista) {
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }

    public static void main(String[] args) {
        Jugador objeto = new Jugador("Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"));
        Jugador objeto1 = new Jugador("Lionel", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"));
        Jugador objeto2 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"));
        Jugador objeto3 = new Jugador("Eden", "Hazard", 27, 590, 2010, new Equipo("Real Madrid", 30, "Madrid"));

        List<Jugador> lista = new ArrayList<>();
        lista.add(objeto);
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        int a = lista.size();
        System.out.println();
        objeto.EscribirLista("‪C:\\Users\\ISTLOJA12\\Desktop\\ejemplo.txt", lista);
        objeto.LeerLista("‪C:\\Users\\ISTLOJA12\\Desktop\\ejemplo.txt");

    }
}
