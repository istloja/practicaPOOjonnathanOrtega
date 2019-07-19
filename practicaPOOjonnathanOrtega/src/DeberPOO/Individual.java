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
public class Individual extends Deporte{
    private String tecnica;
    private boolean manipulaciondeobjetos;
    private double peso;
    private int añosexperiencia;
    private String inteligencia;

    public Individual() {
    }

    public Individual(String tecnica, boolean manipulaciondeobjetos, double peso, int añosexperiencia, String inteligencia, String nombre, int integrantes, int puntaje, String clasededeporte, boolean tipo) {
        super(nombre, integrantes, puntaje, clasededeporte, tipo);
        this.tecnica = tecnica;
        this.manipulaciondeobjetos = manipulaciondeobjetos;
        this.peso = peso;
        this.añosexperiencia = añosexperiencia;
        this.inteligencia = inteligencia;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public boolean isManipulaciondeobjetos() {
        return manipulaciondeobjetos;
    }

    public void setManipulaciondeobjetos(boolean manipulaciondeobjetos) {
        this.manipulaciondeobjetos = manipulaciondeobjetos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(int añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    
    
}
