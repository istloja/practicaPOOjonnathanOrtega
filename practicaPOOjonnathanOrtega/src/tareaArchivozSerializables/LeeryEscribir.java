/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaArchivozSerializables;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author its
 */
public class LeeryEscribir {

    public List<Estudiante> leerPersonas(String url) {
        
            List<Estudiante> Lista = new ArrayList<Estudiante>();
            try {
                ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
                Object auxiliar = lector.readObject();
                while (auxiliar != null) {
                    Estudiante p1 = (Estudiante) auxiliar;
                    Lista.add(p1);
                    auxiliar = lector.readObject();
                }

            } catch (Exception e) {//
                System.out.println("error"+e);
            }

      
        return Lista;

    }

    public void leerLista(String variable) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(variable));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante p1 = (Estudiante) auxiliar;
                System.out.println("su direccion "+p1.getDireccion());
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    public void escribirObjeto(String direccion, Estudiante p1) {

        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            escritorio.writeObject(p1);                                                                 
            escritorio.close();
        } catch (Exception e) {
            System.out.println("se produjo un error en " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Estudiante p1 = (Estudiante) auxiliar;
            System.out.println("leer direccion");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirLista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {
                escritorio.writeObject(estudiante);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Estudiante p2=new Estudiante ("jonnathan","ortega",20,"quito",new Materia
        (" algebra ",2,"jhon",new Carrera("software",5,2)));
        Estudiante p3=new Estudiante (" jose "," nitales ",23,"carcelen",new Materia
        (" quimica ",2,"manuel",new Carrera("mecanica",5,2)));
           Estudiante p4=new Estudiante ("  luis "," ramirez ",24,"malacatos",new Materia
        (" fisica ",2,"eduardo",new Carrera("Contabilidad",5,2)));
              Estudiante p5=new Estudiante (" alex "," ullauri ",27,"saraguro",new Materia
        (" matematicas ",2,"freddy",new Carrera("software",5,2)));
                Estudiante p6=new Estudiante (" josue "," remache ",12,"cumbe",new Materia
        (" quimica ",2,"andrea",new Carrera("Contabilidad3",5,2)));
                  Estudiante p7=new Estudiante ("  luis "," ramirez ",24,"malacatos",new Materia
        (" fisica ",2,"eduardo",new Carrera("Contabilidad",5,2)));
              Estudiante p8=new Estudiante (" alex "," ullauri ",27,"saraguro",new Materia
        (" matematicas ",2,"freddy",new Carrera("software",5,2)));
                Estudiante p9=new Estudiante (" josue "," remache ",12,"cumbe",new Materia
        (" quimica ",2,"andrea",new Carrera("Contabilidad3",5,2)));
  Estudiante p10=new Estudiante ("  luis "," ramirez ",24,"malacatos",new Materia
        (" fisica ",2,"eduardo",new Carrera("Contabilidad",5,2)));
              Estudiante p11=new Estudiante (" alex "," ullauri ",27,"saraguro",new Materia
        (" matematicas ",2,"freddy",new Carrera("software",5,2)));              
       
        
        
        List<Estudiante> Lista = new ArrayList<>();//hacemos una lista para guarar objetos
        //guardamos los objetos en la variable

        Lista.add(p2);
        Lista.add(p3);
        Lista.add(p4);
       Lista.add(p5);
       Lista.add(p6);
         Lista.add(p7);
        Lista.add(p8);
        Lista.add(p9);
       Lista.add(p10);
       Lista.add(p11);
        int a = Lista.size();// numero de listas
        System.out.println(" numero de listas"+a);
     for (Estudiante estudiante : Lista) {// imporimo los nombres de la lista
       //  Estudiante p1=new Estudiante ("Vicente","Luzuriaga",22,"El Sauce",new Materia
       // ("Matematicas",2,"jhon",new Carrera("Contabilidad",5,2)));
        
          System.out.println("Nombre "+estudiante.getNombre()+" Apellido "+ estudiante.getApellido()+" edad "+ estudiante.getEdad()+" Direccion "+estudiante.getDireccion()+" Materia"+
                  estudiante.getMateria().getNombre()+" Creditos "+estudiante.getMateria().getCreditos()+" Docente "+estudiante.getMateria().getDocente()+" Carrera "+estudiante.getMateria().getCarrera().getNombre()
                  +" Ciclos "+estudiante.getMateria().getCarrera().getNumerCiclos()+"  Numero de creditos"+estudiante.getMateria().getCarrera().getNumeroCreditos());
//            
//            
//        }
//        System.out.println(Lista.size());
       objeto.escribirLista("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt", Lista);

      // objeto.escribirObjeto("C:\\Users\\USUARIO\\Desktop\\ejemplo.txt", p2);
        //objeto.leerArchivo("C:\\Users\\ist loja\\Desktop\\\\ejemplo.txt");
        //objeto.leerLista("C:\\Users\\USUARIO\\Desktop\\ejemplo.txt");
      //  List<Estudiante> b=objeto.leerPersonas("C:\\Users\\ISTLOJA12\\Desktop/ejemplo.txt");
        //for (Estudiante estudiante : b) {
           // System.out.println("edades "+ p2.getNombre());
            
        }

    }
}
