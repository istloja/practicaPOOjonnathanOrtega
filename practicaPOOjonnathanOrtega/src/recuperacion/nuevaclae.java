/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Jhonny_Ortega
 */
public class nuevaclae extends JFrame{
    private JList Nimagenes;
    private JLabel etiqueta;
    private JTextArea texto;
    private JPanel panel;
    private String nombres[] = {
        "leon", "istl", "voda moderna"
    };

    private Icon iconos[] = {
        new ImageIcon(getClass().getResource("/ima/1.jpg")),
        new ImageIcon(getClass().getResource("/ima/2.jpg")),
        new ImageIcon(getClass().getResource("/ima/3.jpg")),};

    private String nombre[] = {
        "el leon ", "istloja", "vida moderna"
    };

    public nuevaclae() {
        super("prueba de JCombobox");
        dispose();
        setSize(400, 400);
        setLocation(100, 100);
        setVisible(true);
    }

    public void crearComponentes() {
        getContentPane().add(panel);
        GridBagConstraints b = new GridBagConstraints();
        b.insets = new Insets(10, 50, 20, 10);
        b.gridx = 0;
        b.gridy = 0;

        Nimagenes = new JList(nombres);
        panel.add(Nimagenes, b);
        Nimagenes.addListSelectionListener(new Oyentejlist());

        b.gridx = 1;
        b.gridy = 0;

        etiqueta = new JLabel("aqui se carga la imajen");
        panel.add(etiqueta);

        b.gridx = 1;
        b.gridy = 1;

        texto = new JTextArea("aqui va el texto", 5, 10);
        panel.add(texto, b);
    }

    public class Oyentejlist implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            etiqueta.setText("");
            etiqueta.setIcon(iconos[Nimagenes.getSelectedIndex()]);
            texto.setText(nombre[Nimagenes.getSelectedIndex()]);
        }


    }

    public static void main(String[] args) {
        nuevaclae ñ = new nuevaclae();
    }
}
    

