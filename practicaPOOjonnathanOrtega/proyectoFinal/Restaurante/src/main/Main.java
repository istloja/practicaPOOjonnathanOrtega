/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import restaurante.Menu;

/**
 *
 * @author Bladilu_xxx
 */
public class Main {
       public static void main(String args[]) {
           Menu a=new Menu();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);

            }
        });
    }
    
}
