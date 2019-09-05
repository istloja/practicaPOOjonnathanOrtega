/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticoSerializable;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA12
 */
public class Autor implements Serializable {
     private String nombre;
    private String apellido;
    private int edad;
    private int librospublicados;
    private int fechaNacimineto;

    public Autor() {
    }

    public Autor(String nombre, String apellido, int edad, int librospublicados, int fechaNacimineto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.librospublicados = librospublicados;
        this.fechaNacimineto = fechaNacimineto;
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

    public int getLibrospublicados() {
        return librospublicados;
    }

    public void setLibrospublicados(int librospublicados) {
        this.librospublicados = librospublicados;
    }

    public int getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(int fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

}



    
