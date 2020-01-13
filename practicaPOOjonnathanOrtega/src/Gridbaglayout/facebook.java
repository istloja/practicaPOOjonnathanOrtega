/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gridbaglayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import javax.swing.JLabel;

/**
 *
 * @author ISTLOJA12
 */
public class facebook {
    public static void main(String[] args) {
        IHM ihm = new IHM();
        }
    }
    
class IHM {
    public IHM() {
        Frame miFrame = new Frame( "Tutorial" );
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        miFrame.setLayout( gridbag );

        // Para este grupo fijamos la anchura y vamos variando alguna
        // de las caracteristicas en los siguientes, de tal forma que
        // los botones que aparecen en cada una de las lineas tengan
        // apariencia diferente en pantalla     
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        Button boton01 = new Button( "correo electronico" );
         boton01.setBackground(Color.BLUE);//color al fondo de la ventana
        boton01.setForeground(Color.white);
        gridbag.setConstraints( boton01,gbc );
        miFrame.add( boton01 );
        JLabel l0= new  JLabel();
        gridbag.setConstraints( l0,gbc );
        miFrame.add( l0 );
        Button boton1 = new Button( "contraseña" );
         boton1.setBackground(Color.BLUE);//color al fondo de la ventana
        boton1.setForeground(Color.white);
        gridbag.setConstraints( boton1,gbc );
        miFrame.add( boton1 );
        JLabel l= new  JLabel();
        
        gridbag.setConstraints( l,gbc );
        miFrame.add( l );
        

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        Button boton3 = new Button( "entrar" );
        gridbag.setConstraints( boton3,gbc );
        miFrame.add( boton3 );

        gbc.weightx = 0.1;
        Label boton4 = new Label( "REGISTRARSE" );
        gridbag.setConstraints( boton4,gbc );
        miFrame.add( boton4 );

//        gbc.gridwidth = GridBagConstraints.RELATIVE;
//        Button boton5 = new Button( "Botón 5" );
//        gridbag.setConstraints( boton5,gbc );
//        miFrame.add( boton5 );
//
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
//        Button boton6 = new Button( "Botón 6" );
//        gridbag.setConstraints( boton6,gbc );
//        miFrame.add( boton6 );

        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.weighty = 1.0;
        Label boton7 = new Label( "Botón 7" );
        gridbag.setConstraints( boton7,gbc );
        miFrame.add( boton7 );

        gbc.weighty = 0.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        Button boton8 = new Button( "Botón 8" );
        gridbag.setConstraints( boton8,gbc );
        miFrame.add( boton8 );
        Button boton9 = new Button( "Botón 9" );
        gridbag.setConstraints( boton9,gbc );
        miFrame.add( boton9 );
        miFrame.setSize( 200,200 );
        miFrame.setVisible( true );
        }
    }    

