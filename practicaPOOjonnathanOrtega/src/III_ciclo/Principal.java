/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package III_ciclo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
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
public class Principal extends JFrame {
     JFrame v= new JFrame();// forma creando un objeto 
    JPanel p= new JPanel();
    JButton b= new JButton("ACEPTAR");
    JLabel l= new  JLabel("QUE SEMANA ES?");
    JTextField t= new JTextField(10);
  
    
    public Principal(){ //craer un metodo
        v.setTitle("MI PRIMERA VENTANA");
        v.setLocation(200, 200); 
        v.setSize(400, 400);
        agregarComponentes();
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //accio para cerrar la ventana
        v.setVisible(true);
    }
    public void agregarComponentes(){
        v.getContentPane().add(p);
        String texto = t.getText();
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String texto=t.getText();
                if(!texto.isEmpty()){
                    PaginaSecundaria sec = new PaginaSecundaria();
                    int d = Integer.decode(texto);
                    
                   
                }else{
                    JOptionPane.showMessageDialog(null, "Escribe en la barra");
                }
                
            }
        });
        p.add(l);
        p.add(t);
        p.add(b);
        
    }
     public static void main(String[] args) {
        Principal v=new Principal(); // llamar el metodo
        
    }
    
}
    

