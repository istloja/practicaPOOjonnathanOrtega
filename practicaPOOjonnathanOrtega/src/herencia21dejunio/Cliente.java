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
public class Cliente extends Persona{
    private int ncompras;
    private String formadepago;
    public void comprar(){
        System.out.println("la compra se realizo con exito");
        
        
        
    }

    public int getNcompras() {
        return ncompras;
    }

    public void setNcompras(int ncompras) {
        this.ncompras = ncompras;
    }

    public String getFormadepago() {
        return formadepago;
    }
    @Override //significa que estoy sobreescribiendo
    public void saludar(){
        System.out.println("hola soy un cliente");
    }
    public void test(){
        super.saludar();
    }

    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }
    public static void main(String[] args) {
        Cliente objeto=new Cliente();
        objeto.saludar();
        //objeto.comprar();
        objeto.test();
    }
    
    
}
