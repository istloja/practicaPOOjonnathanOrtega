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
public class Ejecutar {
    public static void main(String[] args) {
        Animal objeto =new Animal("jirafa",10,25,"amarilo con manchas negras",14);
        Aves objeto1=new Aves(5,false,"pinguino",6,7,"balnco con negro",1);
        Mamifero objeto2 =new Mamifero(15,true,"vaca",3,79,"blanca",45);
        Reptiles objeto3=new Reptiles(14,"calido",true,"carnivoros","cocodrilo",16,58,"verde",2);
        Anfibios objeto4=new Anfibios(true,"fina y humeda",1,"sapo americano0",3,2,"verde claro",4);
   
       System.out.println(objeto.informacionAnimal());
        System.out.println(objeto1.informacionAnimal());
        System.out.println(objeto2.informacionAnimal());
        System.out.println(objeto3.informacionAnimal());
        System.out.println(objeto4.informacionAnimal());
    }
    
}
