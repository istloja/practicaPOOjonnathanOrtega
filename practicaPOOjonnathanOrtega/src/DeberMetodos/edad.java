/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberMetodos;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jhonny
 */
public class edad {
    public static void main(String[] args) {
        int nacimiento;
        int añoactual;
        int edad;
        
        String nac;
        Calendar c= Calendar.getInstance();
        añoactual=c.get(Calendar.YEAR);
        
        nac=JOptionPane.showInputDialog(null, "cual es tu año");
        nacimiento=Integer.parseInt(nac);
        System.out.println(añoactual);
        System.out.println(nacimiento);
        edad=añoactual-nacimiento;
        System.out.println(edad);
        
        if(edad>18){
            JOptionPane.showMessageDialog(null, "ES MAYOR DE EDAD");
            
        }else {
            JOptionPane.showMessageDialog(null, "ES MENOR DE EDAD");
        }
        
        
    }
}
