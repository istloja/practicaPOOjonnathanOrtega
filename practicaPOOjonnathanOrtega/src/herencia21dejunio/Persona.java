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
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private String sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }bvgcmghhghcgh

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public void saludar(){
        System.out.println("hola");
    }
    public void despedir(){
        System.out.println("chao");
    }
    public static void main(String[] args) {
        Persona objeto=new Persona();
        objeto.setNombre("Jonnathan");
        System.out.println(objeto.getNombre());
    }
}
