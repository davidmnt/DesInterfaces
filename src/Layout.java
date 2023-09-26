import javax.swing.*;
import java.awt.*;

public class Layout {
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
        panel.setBounds(10,10,250,125);
        panel.setLayout(new BorderLayout(10,10));
        panel.setBackground(Color.cyan);

        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");

        panel.add(boton1,BorderLayout.WEST);
        panel.add(boton2,BorderLayout.CENTER);
        panel.add(boton3,BorderLayout.EAST);

        JPanel panel2 = new JPanel();
        panel2.setBounds(10,10,250,125);
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setBackground(Color.BLUE);

        JButton boton4 = new JButton("Boton 4");
        JButton boton5 = new JButton("Boton 5");

        panel2.add(boton4);
        panel2.add(boton5);

        ventana.add(panel,BorderLayout.NORTH);
        ventana.add(panel2,BorderLayout.SOUTH);

    }
}
