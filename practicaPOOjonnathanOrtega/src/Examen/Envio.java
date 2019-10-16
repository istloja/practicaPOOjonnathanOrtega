/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA12
 */
public class Envio implements Serializable{
    private String fechadeEnvio;
    private String direccionEnvio;

    public Envio() {
    }

    public Envio(String fechadeEnvio, String direccionEnvio) {
        this.fechadeEnvio = fechadeEnvio;
        this.direccionEnvio = direccionEnvio;
    }
    
    

    public String getFechadeEnvio() {
        return fechadeEnvio;
    }

    public void setFechadeEnvio(String fechadeEnvio) {
        this.fechadeEnvio = fechadeEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
    
    
    
    
}
