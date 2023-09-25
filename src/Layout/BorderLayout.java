package Layout;

import javax.swing.*;

public class BorderLayout {
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

        panel.setLayout(new java.awt.BorderLayout());


        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        JButton boton4 = new JButton("Boton 4");
        JButton boton5 = new JButton("Boton 5");


        panel.add(boton1, java.awt.BorderLayout.EAST);
        panel.add(boton2, java.awt.BorderLayout.WEST);
        panel.add(boton3, java.awt.BorderLayout.CENTER);
        panel.add(boton4,java.awt.BorderLayout.NORTH);
        panel.add(boton5,java.awt.BorderLayout.SOUTH);

        ventana.add(panel);

    }
}
