/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA12
 */
public class Comprador implements Serializable {

    private String nombre;
    private String apellido;
    private String direccion;
    private String nomArticulo;
    private double precio;

    public Comprador() {
    }

    public Comprador(String nombre, String apellido, String direccion, String nomArticulo, double precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.nomArticulo = nomArticulo;
        this.precio = precio;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomArticulo() {
        return nomArticulo;
    }

    public void setNomArticulo(String nomArticulo) {
        this.nomArticulo = nomArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

    
    public void escribirLista(String direccion, List<Comprador> lista) {
        try {
            ObjectOutputStream escribi = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Comprador articulo : lista) {
                escribi.writeObject(articulo);
            }
            escribi.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }
    public void leerlistA (String direccion){
        try{
            ObjectInputStream lector = new ObjectInputStream (new FileInputStream(direccion));
             Object auxiliar = lector.readObject();
             Comprador c1 =(Comprador) auxiliar;
             System.out.println("nombre"+c1.nombre+c1.direccion);
              } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Comprador> leercom(String url) {
        List<Comprador> Lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Comprador c = (Comprador) auxiliar;
                Lista.add(c);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return Lista;

    }
//    public Comprador  mayPrecio (List<Comprador>Lista){
//        double preciomax =lista.get(0);
//        for(Comprador comprador :lista){
//            if (preciomax.g)
//        }
//    }
    

    public static void main(String[] args) {
        Comprador objeto = new Comprador();
        Comprador c = new Comprador("joel", "ramirez", "colombia","leches",1.00);
        Comprador c1 = new Comprador("joel", "ramirez", "colombia","maiz",6.00);
        Comprador c2 = new Comprador("joel", "ramirez", "colombia","libros",3.50);
        Comprador c3 = new Comprador("joel", "ramirez", "colombia","mouse",8.20);
        Comprador c4 = new Comprador("joel", "ramirez", "colombia","caja de esferoz",17.00);
        Comprador c5 = new Comprador("joel", "ramirez", "colombia","jeans",55.00);
        Comprador c6 = new Comprador("joel", "ramirez", "colombia","camisas",39.00);
        Comprador c7 = new Comprador("joel", "ramirez", "colombia","mochilas",4.00);
        Comprador c8 = new Comprador("joel", "ramirez", "colombia","cartuchera",3.00);
        Comprador c9 = new Comprador("joel", "ramirez", "colombia","camisetas",5.40);
       

        List<Comprador> Lista = new ArrayList<>();
        Lista.add(c);
        Lista.add(c1);
        Lista.add(c2);
        Lista.add(c3);
        Lista.add(c4);
        Lista.add(c5);
        Lista.add(c6);
        Lista.add(c7);
        Lista.add(c8);
        Lista.add(c9);

        int a = Lista.size();
        System.out.println(a);

        List<Comprador> f = objeto.leercom("C:\\Users\\ISTLOJA12\\Desktop\\comprador.txt");
           
        
        
    }

}
