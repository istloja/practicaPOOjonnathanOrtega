/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ISTLOJA12
 */
public class Animal {
    public String nombre;
    private int edad;
    private double peso;
    private String color;
    private double altura;

    public Animal() {
    }

    public Animal(String nombre, int edad, double peso, String color, double altura) { //constructor
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.altura = altura;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void nombreAnimal(){          //metodo para crear un mensaje
        System.out.println("hola soy un animal");
        
    }
         public String informacionAnimal(){   //metodo stringpara devolver nombre y color
             String informacion= nombre+" "+color+" "+edad+" "+altura+" "+peso;  //para imprimir 
             return informacion;
         } 
         
    public static void main(String[] args) {
        Animal objeto = new Animal(); //crear un objeto primero nombre luego el objeto 
        objeto.setNombre("perro");
        objeto.setEdad(10);        //llamamos alos datos
        objeto.setAltura(15);
        objeto.setPeso(15);    //set dar un valor get llamar un valor 
        objeto.setColor("negro");
        System.out.println(objeto.informacionAnimal());
        
        Animal objeto1=new Animal("gato",5,8,"gris",10); //con el constructor ahorar lineas de codigo 
        System.out.println(objeto1.informacionAnimal());
    }
     
         
         
}
