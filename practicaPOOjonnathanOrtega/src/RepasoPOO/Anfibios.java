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
public class Anfibios extends Animal {
    private boolean veneno;
    private String piel;
    private int tamaño;

    public Anfibios() {
    }

    public Anfibios(boolean veneno, String piel, int tamaño, String nombre, int edad, double peso, String color, double altura) {
        super(nombre, edad, peso, color, altura);
        this.veneno = veneno;
        this.piel = piel;
        this.tamaño = tamaño;
    }
    

    public boolean isVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
}
