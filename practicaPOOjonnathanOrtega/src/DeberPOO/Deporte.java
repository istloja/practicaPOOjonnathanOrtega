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
public class Deporte {
    private String nombre;
    private int integrantes;
    private int puntaje;
    private String clasededeporte;
    private boolean tipo;

    public Deporte() {
    }

    public Deporte(String nombre, int integrantes, int puntaje, String clasededeporte, boolean tipo) {
        this.nombre = nombre;
        this.integrantes = integrantes;
        this.puntaje = puntaje;
        this.clasededeporte = clasededeporte;
        this.tipo = tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getClasededeporte() {
        return clasededeporte;
    }

    public void setClasededeporte(String clasededeporte) {
        this.clasededeporte = clasededeporte;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
    
    public void nombreDeporte(){
       System.out.println("bienvenido que deporte es?");
   } 
   public String informacionDeporte(){
       String informacion = nombre+" "+" "+integrantes+" "+" "+puntaje+" "+clasededeporte+" "+tipo;
       return informacion;
        
     }
    public static void main(String[] args) {
        Deporte objeto=new Deporte();
        objeto.setNombre("futbol");
        objeto.setIntegrantes(11);
        objeto.setPuntaje(10);
        objeto.setClasededeporte("equipo");
        objeto.setTipo(true);
        System.out.println(objeto.informacionDeporte());
        Deporte objeto1=new Deporte("futbol",11,10,"equipo",true);
        System.out.println(objeto1.informacionDeporte());
        
    }
}
