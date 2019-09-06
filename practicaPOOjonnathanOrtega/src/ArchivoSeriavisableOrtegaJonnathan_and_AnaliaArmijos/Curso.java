/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoSeriavisableOrtegaJonnathan_and_AnaliaArmijos;

import java.io.Serializable;

/**
 *
 * @author IST.LOJA
 */
public class Curso implements Serializable{
    private String carrera;
    private String nombre;
    private int numciclo;
    private int numcasa;

    public Curso() {
    }

    public Curso(String carrera, String nombre, int numciclo, int numcasa) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.numciclo = numciclo;
        this.numcasa = numcasa;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumciclo() {
        return numciclo;
    }

    public void setNumciclo(int numciclo) {
        this.numciclo = numciclo;
    }

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }
    
}
