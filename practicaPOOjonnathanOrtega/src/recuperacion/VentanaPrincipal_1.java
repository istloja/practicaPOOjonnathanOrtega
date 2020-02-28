/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Jhonny_Ortega
 */
public class VentanaPrincipal {
     JFrame f=new JFrame();
    JPanel p=new JPanel();
    JMenuBar mb =new JMenuBar();
    JMenu menu1;
    JMenu menu2;
    JMenuItem micalc,mi2,miicons,misalir,mipaint;
    
    public VentanaPrincipal(){
        f.setTitle("VENTANA PRINCIPAL");
        f.setSize(500,450);
        f.setLocation(200,200);
        iniciarComponentes();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void iniciarComponentes(){
        f.setContentPane(p);
        f.setJMenuBar(mb);
        menu1=new JMenu("PROGRAMAS");
        mb.add(menu1);
        
        micalc=new JMenuItem("Calculo de Descuento");
        micalc.addActionListener(new OyenteVentanaPrincipal());
        menu1.add(micalc);
        misalir=new JMenuItem("Salir");
        misalir.addActionListener(new OyenteVentanaPrincipal());
        menu1.add(misalir);
    }
    public class OyenteVentanaPrincipal implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==misalir){
                System.exit(0);
            }
            if(e.getSource()==micalc){
                new Recuperacion();
            }
        }
        
    }
    public static void main(String[] args) {
        VentanaPrincipal pr=new VentanaPrincipal();
    }
}
