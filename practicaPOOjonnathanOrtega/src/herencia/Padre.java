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
public class Padre extends Persona {
 private Hijo hijo;
        public Padre(){
    setNombre("rafael");
    setEdad(39);
    setApellido("Cabrera");
    
    
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }
        
}
