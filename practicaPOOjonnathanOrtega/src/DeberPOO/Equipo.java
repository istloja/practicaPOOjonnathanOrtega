/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberPOO;

/**
 *
 * @author jhonny
 */
public class Equipo extends Deporte{
    private String caracteristica;
    private int edad;
    private boolean reglas;
    private int duracion;
    private double altura;

    public Equipo() {
    }

    public Equipo(String caracteristica, int edad, boolean reglas, int duracion, double altura, String nombre, int integrantes, int puntaje, String clasededeporte, boolean tipo) {
        super(nombre, integrantes, puntaje, clasededeporte, tipo);
        this.caracteristica = caracteristica;
        this.edad = edad;
        this.reglas = reglas;
        this.duracion = duracion;
        this.altura = altura;
    }
    

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isReglas() {
        return reglas;
    }

    public void setReglas(boolean reglas) {
        this.reglas = reglas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
