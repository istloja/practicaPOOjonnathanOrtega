/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package III_CICLO.juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jhonny
 */
public class VentanaPrincipal extends JFrame {

    JTextField t = new JTextField(15);
    JLabel l = new JLabel("que numero de semana estamos?");
    JButton b = new JButton("chequear");
    JPanel p = new JPanel();
    JComboBox combo = new JComboBox();

    public VentanaPrincipal() {
        super("ventana principal");
        setSize(200, 300);
//        pack();
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        agregarComponentes();
    }

    public void agregarComponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);

        p.add(l, c);
        c.gridy = 2;

        p.add(t, c);

        c.weighty = 2;
        p.add(b, c);

        Vector panel = new Vector();
        panel.addElement("semana");
        panel.addElement("año");
        panel.addElement("mes");
        panel.addElement("dia");
        combo = new JComboBox(panel);
        combo.setPreferredSize(new Dimension(200, 25));
        p.add(combo);
        p.add(l);
        p.add(t);
        p.add(b);

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (!t.getText().isEmpty()) {
                    int a = checkCombo(combo.getSelectedIndex());
                    comprobar();
                } else {
                    JOptionPane.showMessageDialog(null, "agrega el numero de la semana");
                }

            }
        });

    }

    public void comprobar() {
        try {
            int num = Integer.parseInt(t.getText());
            Calendar cal = Calendar.getInstance();
            int c = cal.get(Calendar.WEEK_OF_YEAR);
            if (num == c) {
                b.setEnabled(false);
                VentanaResultado r = new VentanaResultado();
                r.lr.setText("correcto ganaste");
                r.lr.setForeground(Color.green);
                r.br.setText("terminar");
            } else {
                b.setEnabled(false);
                VentanaResultado r = new VentanaResultado();
                r.lr.setText("incorrecto perdiste");
                r.lr.setForeground(Color.red);
                r.br.setText("tratar de nuevo");

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "solo ponga numero para jugaer");

        }
    }

    public int checkCombo(int a) {
        int c = 0;
        if (a == 0) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.WEEK_OF_YEAR);
        }
        if (a == 1) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.DAY_OF_YEAR);
        }
         if (a == 2) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.YEAR);
        
         }
          return c;
    }

    public static void main(String[] args) {
        VentanaPrincipal va = new VentanaPrincipal();
    }
}
