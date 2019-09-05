/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticoSerializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA12
 */
public class Libro implements Serializable {
    private int nLibro;
    private int nPagina;
    private String nombreLibro;
    private int codlibro;
    private int AñoPublicacion;
    private Autor autor;

    public Libro() {
    }

    public Libro(int nLibro, int nPagina, String nombreLibro, int codlibro, int AñoPublicacion, Autor autor) {
        this.nLibro = nLibro;
        this.nPagina = nPagina;
        this.nombreLibro = nombreLibro;
        this.codlibro = codlibro;
        this.AñoPublicacion = AñoPublicacion;
        this.autor = autor;
    }

    public int getnLibro() {
        return nLibro;
    }

    public void setnLibro(int nLibro) {
        this.nLibro = nLibro;
    }

    public int getnPagina() {
        return nPagina;
    }

    public void setnPagina(int nPagina) {
        this.nPagina = nPagina;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCodlibro() {
        return codlibro;
    }

    public void setCodlibro(int codlibro) {
        this.codlibro = codlibro;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int AñoPublicacion) {
        this.AñoPublicacion = AñoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void escribirLista(String direccion, List<Libro> lista) {
        try {
            ObjectOutputStream escr = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Libro libro : lista) {
                escr.writeObject(libro);
            }
            escr.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }
    public Libro masAntiguo (List <Libro>lista){
        Libro antiguo =lista.get(0);
        for (Libro libro:lista){
            if (antiguo.getAñoPublicacion()> libro.getAñoPublicacion()){
                antiguo=libro;
            }
        }
        return antiguo;
    }
    public Libro actualizado (List<Libro>lista){
        Libro actualizado= lista.get(0);
        for (Libro libro :lista){
            if (actualizado.getAñoPublicacion()>=2019+5){
                actualizado=libro;
                System.out.println("actulizado"+libro.getNombreLibro());
            }
        }
        return actualizado;
    }
    

    public static void main(String[] args) {
        Libro objeto = new Libro();
        Libro l1 = new Libro(1, 1, "tintin", 005, 2019, new Autor("sherlock", "holmes", 4, 5, 2));
        Libro l2 = new Libro(2, 4, "el amanecer del diablo", 004, 2018, new Autor("vicent", "putin", 4, 5, 2));
        Libro l3 = new Libro(3, 5, "arrastrame al infierno", 007, 2017, new Autor("joel", "luzuriaga", 4, 5, 2));
        Libro l4 = new Libro(4, 6, "los tontos dicen no", 006, 2015, new Autor("vladimir", "samaniego", 4, 5, 2));
        Libro l5 = new Libro(5, 9, "la culpa es de la vaca", 003, 1980, new Autor("kevin", "Smith", 4, 5, 2));
        List<Libro> Lista = new ArrayList<>();
        Lista.add(l1);
        Lista.add(l2);
        Lista.add(l3);
        Lista.add(l4);
        Lista.add(l5);

        objeto.escribirLista("C:\\Users\\ISTLOJA12\\Desktop\\libro.txt", Lista);
        System.out.println("el libro mas antiguo es : "+objeto.masAntiguo(Lista).getNombreLibro());
        System.out.println("el libro actualizado es : "+objeto.actualizado(Lista).getNombreLibro());
       
    }
    
}
