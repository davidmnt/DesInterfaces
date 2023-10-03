package Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayout {
    public static void main(String[] args) {

        //Creamos el objeto de la clase JFrame
        JFrame ventana = new JFrame();
        //Usamos el metodo setBounds para dar las cordenadas y tamanyo a la ventana
        ventana.setBounds(10, 10, 250, 250);
        //Usamos el metodo setVisible para darle visibilidad a la ventana
        ventana.setVisible(true);
        //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.FlowLayout());

        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        JButton boton4 = new JButton("long-named button 4");
        JButton boton5 = new JButton("5");

        JRadioButton radio = new JRadioButton("left to right");
        JRadioButton radio1 = new JRadioButton("right to left");

        JButton boton6 = new JButton("Boton 6");


        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(radio);
        panel.add(radio1);
        panel.add(boton6);




        ventana.add(panel);


    }
}
