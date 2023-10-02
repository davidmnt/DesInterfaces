package Layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagLayout {
    public static void main(String[] args) {


        //Creamos el objeto de la clase JFrame
        JFrame ventana = new JFrame();
        //Usamos el metodo setBounds para dar las cordenadas y tamanyo a la ventana
        ventana.setBounds(10, 10, 350, 400);
        //Usamos el metodo setVisible para darle visibilidad a la ventana
        ventana.setVisible(true);
        //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new java.awt.GridBagLayout());
        panelPrincipal.repaint(10,10,350,400);



        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        JButton boton4 = new JButton("Boton 4");
        JTextField rellenar = new JTextField();

        panelPrincipal.add(rellenar,
                new GridBagConstraints(
                        0,
                        1,
                        3,
                        1,
                        1.0,
                        3.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));



        panelPrincipal.add(boton1,
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        boton1.addActionListener(accionBotones(rellenar,boton1));

        panelPrincipal.add(boton2,
                new GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        boton2.addActionListener(accionBotones(rellenar,boton2));

        panelPrincipal.add(boton3,
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        boton3.addActionListener(accionBotones(rellenar,boton3));


        panelPrincipal.add(boton4,
                new GridBagConstraints(
                        1,
                        2,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));

        boton4.addActionListener(accionBotones(rellenar,boton4));


        ventana.add(panelPrincipal);

    }

    private static ActionListener accionBotones(JTextField rellenar,JButton boton){

        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String entrada = boton.getText();

                rellenar.setText(rellenar.getText() +  entrada);

            }
        };
        return ac;
    }

}
