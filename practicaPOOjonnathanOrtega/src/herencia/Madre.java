/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author its
 */
public class Madre extends Persona {
    Hijo hijo;
    public Madre(){
    setNombre("Paulina");
    setEdad(38);
    setApellido("Ortega");
    hijo=new Hijo();
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }
    
    
}
