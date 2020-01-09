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
public class Direccion implements Serializable{
    private String ciudad;
    private String calle;
    private  int numcasa;

    public Direccion() {
    }

    public Direccion(String ciudad, String calle, int numcasa) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numcasa = numcasa;
    }

    public String getCiudad() {
        return ciudad;
    }
}