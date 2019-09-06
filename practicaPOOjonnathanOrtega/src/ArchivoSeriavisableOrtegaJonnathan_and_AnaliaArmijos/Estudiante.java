/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoSeriavisableOrtegaJonnathan_and_AnaliaArmijos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author IST.LOJA
 */
public class Estudiante implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private int promedio;
    private Direccion direccion;
    private Curso curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, int promedio, Direccion direccion, Curso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
        this.direccion = direccion;
        this.curso = curso;
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

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void escribirlista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {
                escritor.writeObject(estudiante);
            }
            escritor.close();

        } catch (Exception e) {
            System.out.println("se ha producido un error" + e);
        }
    }

    public void escribirObjeto(String direccion, Estudiante estudiante) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(estudiante);
            escritor.close();

        } catch (Exception e) {
            System.out.println("se produjo un error" + e);

        }
    }

    public Estudiante menEdad(List<Estudiante> lista) {
        Estudiante menor = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (estudiante.getEdad() < menor.getEdad()) {
                menor = estudiante;

            }
        }
        return menor;

    }

    public Estudiante mayEdad(List<Estudiante> lista) {
        Estudiante mayor = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (estudiante.getEdad() > mayor.getEdad()) {
                mayor = estudiante;

            }
        }
        return mayor;

    }

    public Estudiante mayPromedio(List<Estudiante> lista) {
        Estudiante pro = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (estudiante.getPromedio() > pro.getPromedio()) {
                pro = estudiante;

            }
        }
        return pro;

    }

   public Estudiante mayorenCiudad(List<Estudiante>lista){
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        for (Estudiante lista1 : lista){
            System.out.println(lista1.getDireccion().getCiudad());
            mapa.put(lista1.getDireccion().getCiudad(), mapa.getOrDefault(lista1.getDireccion().getCiudad(), 0)+1);
        }
        System.out.println(mapa);
        return null;
   }

    public static void main(String[] args) {
         HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("loja", 4);
        mapa.put("cuenca", 3);
        mapa.put("loja",mapa.get("loja")+1);
        
        System.out.println(mapa.get("Loja"));
        
        
        
        
        Estudiante objeto = new Estudiante();
        Estudiante es1 = new Estudiante("juan", "fliores", 20, 8, new Direccion("loja", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es2 = new Estudiante("fernando", "gonzales", 18, 9, new Direccion("cuenca", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es3 = new Estudiante("lui ", "capo", 18, 5, new Direccion("quito", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es4 = new Estudiante("carlos", "pineda", 18, 8, new Direccion("loja", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es5 = new Estudiante("kein", "roa", 18, 7, new Direccion("loja", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es6 = new Estudiante("rodolfo", "ramirez", 18, 9, new Direccion("guayaquil", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es7 = new Estudiante("francel", "galarza", 18, 4, new Direccion("quevdo", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es8 = new Estudiante("leonarno", "valladares", 18, 5, new Direccion("carchi", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es9 = new Estudiante("chino", "santos", 18, 1, new Direccion("Zamora", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        Estudiante es10 = new Estudiante("cristian", "armijos", 18, 10, new Direccion("loja", "bolivar", 12), new Curso("medicina", "juan", 5, 54));
        List<Estudiante> Lista = new ArrayList<>();
        Lista.add(es1);
        Lista.add(es2);
        Lista.add(es3);
        Lista.add(es5);
        Lista.add(es6);
        Lista.add(es7);
        Lista.add(es8);
        Lista.add(es9);
        Lista.add(es10);
        int a = Lista.size();
        objeto.escribirlista("C:\\Users\\IST.LOJA\\Desktop\\prueba.txt", Lista);

        System.out.println("el estudiante de menor edad es " + objeto.menEdad(Lista).getNombre());
        System.out.println("el estudiante de emayor edad es  " + objeto.mayEdad(Lista).getNombre());
        System.out.println("el que tiene mayor promedio es " + objeto.mayPromedio(Lista).getNombre());
        System.out.println("el numero de ciudad es " + objeto.mayorenCiudad(Lista));

    }
}