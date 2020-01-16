/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package III_ciclo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ISTLOJA12
 */
public class PaginaSecundaria extends JFrame{
    JFrame v= new JFrame();// forma creando un objeto 
    JPanel p= new JPanel();
    JLabel l= new JLabel("correcto");
    JLabel l1= new JLabel("incorrecto");
    JButton b1= new JButton("regresar");
    
    
    public PaginaSecundaria(){ //craer un metodo
        v.setTitle("MI PRIMERA VENTANA");
        v.setLocation(200, 200); 
        v.setSize(400, 400);
        agregarComponentes();
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //accio para cerrar la ventana
        v.setVisible(true);
    }
    public void agregarComponentes(){
        v.getContentPane().add(p);
      
      
       
        p.add(l);
        p.add(l1);
        p.add(b1);
       
    }
//     public static void main(String[] args) {
//        PaginaSecundaria v=new PaginaSecundaria(); // llamar el metodo
//        Principal a=new Principal();
//    }
    
}
    
    

