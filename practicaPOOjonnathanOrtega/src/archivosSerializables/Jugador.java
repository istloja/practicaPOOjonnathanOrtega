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
    private int perdidasbalon;
    private int asistencias;
    private double kmrecorridos;
    private int pasescompletados;
    private int fallosgol;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int numerodegoles, int añodedebut, Equipo equipo, int perdidasbalon, int asistencias, double kmrecorridos, int pasescompletados, int fallosgol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numerodegoles = numerodegoles;
        this.añodedebut = añodedebut;
        this.equipo = equipo;
        this.perdidasbalon = perdidasbalon;
        this.asistencias = asistencias;
        this.kmrecorridos = kmrecorridos;
        this.pasescompletados = pasescompletados;
        this.fallosgol = fallosgol;
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

    public int getPerdidasbalon() {
        return perdidasbalon;
    }

    public void setPerdidasbalon(int perdidasbalon) {
        this.perdidasbalon = perdidasbalon;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public double getKmrecorridos() {
        return kmrecorridos;
    }

    public void setKmrecorridos(double kmrecorridos) {
        this.kmrecorridos = kmrecorridos;
    }

    public int getPasescompletados() {
        return pasescompletados;
    }

    public void setPasescompletados(int pasescompletados) {
        this.pasescompletados = pasescompletados;
    }

    public int getFallosgol() {
        return fallosgol;
    }

    public void setFallosgol(int fallosgol) {
        this.fallosgol = fallosgol;
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
        int edadmaxima = lista.get(0).getEdad();

        for (Jugador jugador : lista) {
            if (jugador.getEdad() > edadmaxima) {
                edadmaxima = jugador.getEdad();
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

    public Jugador debut(List<Jugador> lista) {
        Jugador añodebut = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getAñodedebut() > añodebut.getAñodedebut()) {
                añodebut = jugador;
            }

        }
        return añodebut;

    }

//    public Jugador titulos(List<Jugador> lista) {
//        Jugador mastitulo = lista.get(0);
//        for (Jugador jugador : lista) {
//            if (jugador.getEquipo().getNumerotitulos() > mastitulo.getEquipo().getNumerotitulos()) {
//                mastitulo = jugador;
//            }
//            return mastitulo;
//        }
//    }
    public Jugador masGoles(List<Jugador> lista) {
        Jugador mayorgoles = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getNumerodegoles() > mayorgoles.getNumerodegoles()) {
                mayorgoles = jugador;
            }
        }

        return mayorgoles;
    }

    public void EscribirLista(String direccion, List<Jugador> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));

            for (Jugador jugador : lista) {
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }

    public double porcentajeAcierto(Jugador jugadorp) {
        return (jugadorp.getNumerodegoles() + jugadorp.getAsistencias()) / jugadorp.getFallosgol();
    }

    public double porcentajeefectividad(Jugador jugadorfec) {
        return (jugadorfec.getPasescompletados() / jugadorfec.getPerdidasbalon());
    }

    public double eficienciaJugador(Jugador jugadoref) {
        return porcentajeAcierto(jugadoref) + porcentajeefectividad(jugadoref) + jugadoref.getKmrecorridos();
    }

    public Jugador Mayoreficiebcia(List<Jugador> lista) {
        Jugador mayorefectividad = lista.get(0);
        for (Jugador jugador : lista) {
            if (eficienciaJugador(jugador) > eficienciaJugador(mayorefectividad)) {
                mayorefectividad = jugador;

            }

        }
        return mayorefectividad;
    }

    public Jugador maPorcentajedeAcierto(List<Jugador> lista) {
        Jugador mayorporcentaje = lista.get(0);
        for (Jugador jugador : lista) {
            if (porcentajeAcierto(jugador) > porcentajeefectividad(mayorporcentaje)) {
                mayorporcentaje = jugador;
            }

        }
        return mayorporcentaje;

    }

    public Jugador maPorcentajeefectividad(List<Jugador> lista) {
        Jugador maPorcentajeefectividad = lista.get(0);
        for (Jugador jugador : lista) {
            if (porcentajeefectividad(jugador) > porcentajeefectividad(maPorcentajeefectividad)) {
                maPorcentajeefectividad = jugador;
            }
        }
        return maPorcentajeefectividad;
    }

    public int numcaracteres(Jugador jugador) {
        return jugador.getNombre().length() + jugador.getApellido().length();
    }

    public Jugador mayorCaracter(List<Jugador> lista) {
        Jugador mayorCaracter = lista.get(0);
        for (Jugador jugador : lista) {
            if (numcaracteres(jugador) > numcaracteres(mayorCaracter)) {
                mayorCaracter = jugador;
            }

        }
        return mayorCaracter;
    }

    public int nucaracteres(Jugador jugador) {
        return jugador.getNombre().length() + jugador.getApellido().length();
    }

    public Jugador menorCaracter(List<Jugador> lista) {
        Jugador menorCaracter = lista.get(0);
        for (Jugador jugador : lista) {
            if (numcaracteres(jugador) < numcaracteres(menorCaracter)) {
                menorCaracter = jugador;
            }

        }
        return menorCaracter;
    }

    public static void main(String[] args) {
        Jugador objeto = new Jugador("Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"), 5, 7, 2.4, 8, 5);
        Jugador objeto1 = new Jugador("Lionel", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"), 15, 47, 22.4, 18, 25);
        Jugador objeto2 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"), 15, 47, 22.4, 18, 25);
        Jugador objeto3 = new Jugador("Eden", "Hazard", 27, 590, 2010, new Equipo("Real Madrid", 30, "Madrid"), 15, 47, 22.4, 18, 25);
        Jugador objeto4 = new Jugador("edison", "cavani", 27, 59, 2010, new Equipo("paris", 3, "psg"), 15, 4, 22.4, 18, 25);
        Jugador objeto5 = new Jugador("diego", "maradona", 27, 90, 2010, new Equipo("boca", 30, "argentina"), 15, 47, 22.4, 18, 25);
        Jugador objeto6 = new Jugador("antonio", "valencia", 27, 390, 2010, new Equipo("ecuador", 30, "Madrid"), 15, 47, 22.4, 18, 25);
        Jugador objeto7 = new Jugador("diablito", "lara", 27, 590, 2010, new Equipo("ecuador", 30, "Madrid"), 15, 47, 22.4, 18, 25);
        Jugador objeto8 = new Jugador("Ede", "zard", 27, 5, 2010, new Equipo("ecuador", 30, "Madrid"), 15, 47, 22.4, 18, 25);
        Jugador objeto9 = new Jugador("adan", "loja", 27, 93, 2010, new Equipo("Real Madrid", 30, "Madrid"), 15, 47, 22.4, 18, 25);

        List<Jugador> lista = new ArrayList<>();
        lista.add(objeto);
        lista.add(objeto1);
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
        lista.add(objeto6);
        lista.add(objeto7);
        lista.add(objeto8);
        lista.add(objeto9);

        int a = lista.size();
        System.out.println();
        objeto.leerJugador("‪C:\\Users\\ISTLOJA12\\Documents\\ejemplo.txt");
        objeto.LeerLista("‪C:\\Users\\ISTLOJA12\\Documents\\ejemplo.txt");
        objeto.EscribirLista("‪C:\\Users\\ISTLOJA12\\Documents\\ejemplo.txt", lista);
        //objeto.edadMenos(lista);

        List<Jugador> al = objeto.leerJugador("‪C:\\Users\\ISTLOJA12\\Documents\\ejemplo.txt");
        System.out.println(objeto.debut(al).getAñodedebut());
        //System.out.println(objeto.titulos(al).getNumerodegoles());
        System.out.println("el jugador con mas porcentaje acierto" + objeto.maPorcentajedeAcierto(lista).getNombre());
        System.out.println("el jugador conmas efectividad" + objeto.maPorcentajeefectividad(lista).getNombre());
        System.out.println("mas caracteres" + objeto.mayorCaracter(lista).getNombre() + objeto.mayorCaracter(lista).getApellido());
        System.out.println("menor caracteres" + objeto.menorCaracter(lista).getNombre() + objeto.menorCaracter(lista).getApellido());
    }
}
