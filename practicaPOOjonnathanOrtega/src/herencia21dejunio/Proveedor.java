/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21dejunio;

/**
 *
 * @author ISTLOJA12
 */
public class Proveedor extends Cliente {
    private String vender;
    private String produccion;
    public void vender(){
        System.out.println("como proveedor te vendo mis productos");
        
        
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public String getProduccion() {
        return produccion;
    }
    public void produccion(){
        System.out.println("la produccion de la empresa");
    }

    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }
    public static void main(String[] args) {
        Proveedor objeto=new Proveedor();
        objeto.saludar();
        objeto.vender();
        objeto.produccion();
    }
    
}
