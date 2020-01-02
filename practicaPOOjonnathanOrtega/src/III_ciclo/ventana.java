/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package III_ciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author CRISTINA CALLE
 */
public class ventana {
    public static void main(String[] args) {

    boolean arroba = false;

    boolean punto = false;

    String mail = JOptionPane.showInputDialog("Ingrese su email por favor: ");

    for (int i = 0; i<mail.length(); i++) {

        for (int j = 0; j<mail.length(); j++) {

            if(mail.charAt(i)=='@' && mail.charAt(j)=='.') {

                arroba = true;
                punto = true;
            }

        }

    }

    if (arroba == true && punto == true) {

        System.out.println("El mail ingresado es correcto");
    }
    else {
        System.out.println("El mail ingresado es incorrecto");
        }

     }

}

    

