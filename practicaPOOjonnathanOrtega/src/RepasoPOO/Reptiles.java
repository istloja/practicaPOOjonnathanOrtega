/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ISTLOJA12
 */
public class Reptiles extends Animal{
    private int tamaño;
    private String habitad;
    private boolean nadan;
    private String alimentacion;

    public Reptiles() {
    }

    public Reptiles(int tamaño, String habitad, boolean nadan, String alimentacion, String nombre, int edad, double peso, String color, double altura) {
        super(nombre, edad, peso, color, altura);
        this.tamaño = tamaño;
        this.habitad = habitad;
        this.nadan = nadan;
        this.alimentacion = alimentacion;
    }

    
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public boolean isNadan() {
        return nadan;
    }

    public void setNadan(boolean nadan) {
        this.nadan = nadan;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    
    
    
    
}
