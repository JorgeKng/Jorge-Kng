/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istLoja.vistas;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jorge Kng
 */
public class GestionPersonas extends JFrame {
    private final JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();

    public GestionPersonas(){
        // Hacer Vsible
        this.setVisible(true);
        //Hacer Visible en versiones anteriores
        this.show();
        //Titulo de la Ventana
        this.setTitle("Ventana");
        //Dimensiones
        this.setSize(400,600);
        //Un lyaut para distribuir los componentes
        panel.setLayout(new FlowLayout());
        panel1.setLayout(new GridLayout(3,3));
        JLabel label = new JLabel("Ventana de Registro de Personas");
        JLabel IdPersona = new JLabel("ID Persona");
        JLabel Cedula = new JLabel("Cédula");
        JLabel Nombre = new JLabel("Nombre");
        JLabel Apellido = new JLabel("Apellido");
        JLabel Telefono = new JLabel("Teléfono");
        JTextField id = new JTextField();
        JTextField cedula = new JTextField();
        JTextField nombre = new JTextField();
        JTextField apellido = new JTextField();
        JTextField telefono = new JTextField();
        JButton boton = new JButton (); 
        boton.setText("Guardar");
        panel.add(label);
        panel1.add(IdPersona);
        panel1.add(id);
        panel1.add(Cedula);
        panel1.add(cedula);
        panel1.add(Nombre);
        panel1.add(nombre);
        panel1.add(Apellido);
        panel1.add(apellido);
        panel1.add(Telefono);
        panel1.add(telefono);
        
      
        panel1.add(boton);
        //Agregar el panel al JFrame
        this.add(panel);
        this.add(panel1);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                
        
        
        
    }

  
    
    
}
