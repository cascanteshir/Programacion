/**
 * Primera parte del juego del gato que estamos haciendo en clase.
 * Para esta entrega se nos pidió crear la inferfaz solamente.
 * El control de turnos está manejado por la variable "turno".
 */

import java.awt.event.*;
import javax.swing.*;


public class Gato{

    public static void main(String[] args){


        String turno = "X"; //Manejo de turnos

        JFrame frame = new JFrame("Gato");

        //Creación de botones y actionListeners
        JButton boton1 = new JButton(" ");
        boton1.setBounds(20,100,50, 40);
        boton1.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton1.setText("X");
                }else{
                    boton1.setText("O");
                }
            }
        });

        JButton boton2 = new JButton(" ");
        boton2.setBounds(70,100,50, 40);
        boton2.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton2.setText("X");
                }else{
                    boton2.setText("O");
                }            
            }
        });

        JButton boton3 = new JButton(" ");
        boton3.setBounds(120,100,50, 40);
        boton3.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton3.setText("X");
                }else{
                    boton3.setText("O");
                }            
            }
        });

        JButton boton4 = new JButton(" ");
        boton4.setBounds(20,140,50, 40);
        boton4.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton4.setText("X");
                }else{
                    boton4.setText("O");
                }            
            }
        });

        JButton boton5 = new JButton(" ");
        boton5.setBounds(70,140,50, 40);
        boton5.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton5.setText("X");
                }else{
                    boton5.setText("O");
                }            
            }
        });

        JButton boton6 = new JButton(" ");
        boton6.setBounds(120,140,50, 40);
        boton6.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton6.setText("X");
                }else{
                    boton6.setText("O");
                }            
            }
        });

        JButton boton7 = new JButton(" ");
        boton7.setBounds(20,180,50, 40);
        boton7.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton7.setText("X");
                }else{
                    boton7.setText("O");
                }            
            }
        });

        JButton boton8 = new JButton(" ");
        boton8.setBounds(70,180,50, 40);
        boton8.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton8.setText("X");
                }else{
                    boton8.setText("O");
                }            
            }
        });

        JButton boton9 = new JButton(" ");
        boton9.setBounds(120,180,50, 40);
        boton9.addActionListener(new ActionListener(){
         
            public void actionPerformed(ActionEvent e){
                if(turno == "X"){
                    boton9.setText("X");
                }else{
                    boton9.setText("O");
                }            
            }
        });


        //Agregar botones al frame
        frame.add(boton1);
        frame.add(boton2);
        frame.add(boton3);
        frame.add(boton4);
        frame.add(boton5);
        frame.add(boton6);
        frame.add(boton7);
        frame.add(boton8);
        frame.add(boton9);

        //Definir y mostrar frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);


    }


}