import javax.swing.*;
import java.awt.*;

public class Dia2 {
    public static void main(String[] args) {
        //Creamos el objeto de la clase JFrame
        JFrame ventana = new JFrame();
        //Usamos el metodo setBounds para dar las cordenadas y tamanyo a la ventana
        ventana.setBounds(10, 10, 250, 250);
        //Usamos el metodo setVisible para darle visibilidad a la ventana
        ventana.setVisible(true);
        //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout());

        JPanel panel1 = new JPanel();
        panel1.setBounds(10,10,80,40);
        panel1.setBackground(Color.red);
        JButton boton1 = new JButton("Boton 1");
        panel1.add(boton1);

        JPanel panel2 = new JPanel();

        panel2.setBounds(10,10,10,40);
        panel2.setBackground(Color.BLUE);
        JButton boton2 = new JButton("Boton 2");
        panel2.add(boton2);

        JPanel panel3 = new JPanel();

        panel3.setBounds(10,10,10,40);
        JButton boton3 = new JButton("Boton 3");
        panel3.add(boton3);

        ventana.add(panel1);
        ventana.add(panel2);
        ventana.add(panel3);


    }
}
