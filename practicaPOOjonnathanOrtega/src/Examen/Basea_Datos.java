/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import Base_de_Datos.Conexion_basica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ISTLOJA12
 */
public class Basea_Datos {
     public void leer(String usuario, String clave){
        try {
             DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
             Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/examen?characterEncoding=latin1",usuario,clave);
             System.out.println(conexion.getCatalog());
             Statement variable = conexion.createStatement();
             ResultSet resultado = variable.executeQuery("select * from examen");
             while (resultado.next()){
                 System.out.println(resultado.getString("nombre")+resultado.getString("apellido")++resultado.getString("direccion"));
             }
         }
        } catch (Exception e) {
            System.out.println("error"+e);
        }
       
    }
    public static void main(String[] args) {
        Conexion_basica objeto =new Conexion_basica();
        objeto.leer("jonnathan", "12345");
    }
    
}
