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

    JLabel l = new JLabel("escoje que quieres adivinar?");
    JTextField t = new JTextField(15);
    JButton b = new JButton("chequear");
    JPanel p = new JPanel();
    VentanaResultado r;
    JComboBox combo = new JComboBox();

    public VentanaPrincipal() {
        super("ventana principal");
        setSize(350, 350);
        setLocation(300, 300);
        setVisible(true);

        agregarComnponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void agregarComnponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);

        p.add(l, c);
        c.gridy = 1;

        p.add(t, c);
        c.gridy = 2;

        p.add(b, c);

        String[] pr = {"semana", "año", "mes", "dia"};

        combo = new JComboBox(pr);
        combo.setPreferredSize(new Dimension(120, 20));
        p.add(combo);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!t.getText().isEmpty()) {

                    int a = checkCombo(combo.getSelectedIndex());

                } else {
                    JOptionPane.showMessageDialog(null, "agrega" + "el numero");
                }

            }

        });

    }

    public int checkCombo(int a) {
        int c = 0;

        if (a == 0) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.WEEK_OF_YEAR);
        }
        if (a == 1) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.YEAR);
        }
        if (a == 2) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.JANUARY);

        }
        if (a == 3) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.DAY_OF_YEAR);
        }

        try {
            int num = Integer.parseInt(t.getText());

            if (num == c) {
                b.setEnabled(false);
                VentanaResultado r = new VentanaResultado();
                r.lr.setText("CORRECTO GANASTE");
                r.lr.setForeground(Color.green);
                r.br.setText("terminar");
            } else {
                //b.setEnabled(false);
                r = new VentanaResultado();
                r.lr.setText("INCORRECTO PERDISTES");
                r.lr.setForeground(Color.red);
                r.br.setText("REINTENTAR");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "solo permite numeros");

        }
        return c;

    }

    public static void main(String[] args) {
        VentanaPrincipal va = new VentanaPrincipal();

    }
}
