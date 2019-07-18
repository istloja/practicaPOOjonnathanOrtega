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
public class Mamifero extends Animal{
    private int tiempodegestacion;
    private boolean pelaje;

    public Mamifero() {
    }

    public Mamifero(int tiempodegestacion, boolean pelaje, String nombre, int edad, double peso, String color, double altura) {
        super(nombre, edad, peso, color, altura);
        this.tiempodegestacion = tiempodegestacion;
        this.pelaje = pelaje;
    }
    
    

    public int getTiempodegestacion() {
        return tiempodegestacion;
    }

    public void setTiempodegestacion(int tiempodegestacion) {
        this.tiempodegestacion = tiempodegestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    
    
    
}
