/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formulario;

import javax.swing.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener{
    private JTextField textfield1,textfield2;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    public Formulario() {
        setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,100,30);
        add(textfield1);
        
        textfield2=new JTextField();
        textfield2.setBounds(10,50,100,30);
        add(textfield2);
        
        boton1=new JButton("Sumar");
        boton1.setBounds(10,90,100,30);
        add(boton1);
        boton1.addActionListener(this);
        add(textfield2);
        
        boton2=new JButton("Restar");
        boton2.setBounds(10,130,100,30);
        add(boton2);
        boton2.addActionListener(this);
        add(textfield2);
        
        boton3=new JButton("Multiplicar");
        boton3.setBounds(10,170,100,30);
        add(boton3);
        boton3.addActionListener(this);
        add(textfield2);
        
        boton4=new JButton("Dividir");
        boton4.setBounds(10,210,100,30);
        add(boton4);
        boton4.addActionListener(this);
        add(textfield2);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1+x2;
            String total=String.valueOf(suma);
            setTitle(total);
        }
    }
    
     public void actionPerformed2(ActionEvent i) {
        if (i.getSource()==boton2) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int resta=x1-x2;
            String total=String.valueOf(resta);
            setTitle(total);
        }
    }
    
    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,240,170);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}