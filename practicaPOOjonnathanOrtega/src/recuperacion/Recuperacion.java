/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ISTLOJA_01
 */
public class Recuperacion {
    
    JFrame f = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel et1 = new JLabel("precio");
    JLabel et2 = new JLabel("total");
//    JLabel et3=new JLabel("iva");
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
//    JTextField tx3= new JTextField();
    JCheckBox che1 = new JCheckBox("Estudiante");
    JCheckBox che2 = new JCheckBox("Fumador");
    JCheckBox che3 = new JCheckBox("Menor de Edad");
    JButton bcal = new JButton("calcular");
    JButton bce = new JButton("cerrar");
    
    public Recuperacion() {
//        f.setName(t1);
        f.setSize(500, 450);
        f.setLocation(100, 100);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viajar();
    }
    
    public void calculardescuento() {
        
        f.setSize(500, 450);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void viajar() {
        f.setContentPane(panel);
        panel.setBackground(Color.WHITE);
        //AGREGO AL 
        panel.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
       
        panel1.setBackground(Color.lightGray);
         a.gridx = 0;
        a.gridy = 0;
        panel.add(panel1, a);
        
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        b.gridx = 0;
        b.gridy = 0;
        panel1.add(et1, b);
        b.gridx = 1;
        panel1.add(t1, b);
        
        b.gridx = 0;
        b.gridy = 1;
        panel1.add(et2, b);
        b.gridx = 1;
        panel1.add(t2, b);
        a.gridy = 2;
//AGREGAR PANEL2 AL APANEL PRINCIPAL
        panel.add(panel2, a);
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.red);
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        panel2.add(che1, c);
        c.gridx = 1;
        
        panel2.add(che2, c);
        c.gridx = 2;
        panel2.add(che3, c);
        c.gridx = 3;
        
        a.gridx = 0;
       
         a.gridy = 3;
          panel.add(panel3, a);
        panel3.setLayout(new GridBagLayout());
        GridBagConstraints d = new GridBagConstraints();
        d.gridy = 0;
        d.gridx = 1;
        panel3.add(bcal, d);
          d.gridy = 0;
        d.gridx = 2;
        panel3.add(bce, d);
        bce.addActionListener(new OyenteViaje());
         bcal.addActionListener(new OyenteViaje());
    }

    public class OyenteViaje implements ActionListener {

        Boleto b = new Boleto();
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == bcal) {
                    b.setPrecio(Double.parseDouble(t1.getText()));
                    double a = b.getPrecio();
                    if (che1.isSelected() == true && che2.isSelected()==true && che3.isSelected()==true) {
                        a = b.getPrecio()-(b.descuento("estudiante")+b.descuento("frumador")+b.descuento("menor"));
                    } else if (che1.isSelected() == true && che2.isSelected()==true) {
                        a = b.getPrecio()-(b.descuento("estudiante")+b.descuento("fumador"));
                    } else if (che1.isSelected() == true && che3.isSelected()== true) {
                        a = b.getPrecio()-(b.descuento("estudiante")+b.descuento("menor"));
                    }else if (che2.isSelected()==true && che3.isSelected()==true){
                        a=b.getPrecio()-(b.descuento("fumador")+b.descuento("menor"));
                    }else if(che1.isSelected()==true){
                        a=b.getPrecio()-b.descuento("estudiante");
                    }else if(che2.isSelected()==true){
                        a=b.getPrecio()-b.descuento("fumador");
                    }else if(che3.isSelected()==true){
                        a=b.getPrecio()-b.descuento("menor");
                    }
                    t2.setText("" + a );
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "no inserte ningun valor");
            }
            if (e.getSource() == bce) {
                System.exit(0);
            }
        }
    }
    
}
