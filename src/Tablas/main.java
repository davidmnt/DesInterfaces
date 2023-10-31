package Tablas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    static Tablas tab = new Tablas();
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 550, 550);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel panelPinc = new JPanel();
        panelPinc.setLayout(new GridBagLayout());
        panelPinc.setBounds(0,0,550,550);

        JLabel titulo = new JLabel("Registro de usuarios");
        panelPinc.add(titulo,
                new GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        2.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        JLabel nombreLabel = new JLabel("Nombre:");
        panelPinc.add(nombreLabel,
                new GridBagConstraints(
                        0,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,0),
                        0,
                        0
                ));

        JTextField nombre = new JTextField();
        panelPinc.add(nombre,
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.WEST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,30),
                        0,
                        0
                ));

        JLabel apellidoLabel = new JLabel("Apellido:");
        panelPinc.add(apellidoLabel,
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,0),
                        0,
                        0
                ));

        JTextField apellido = new JTextField();
        panelPinc.add(apellido,
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.WEST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,30),
                        0,
                        0
                ));

        JLabel dniLabel = new JLabel("Dni:");
        panelPinc.add(dniLabel,
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,0),
                        0,
                        0
                ));

        JTextField dni = new JTextField();
        panelPinc.add(dni,
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.WEST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,30),
                        0,
                        0
                ));

        JLabel emailLabel = new JLabel("Email:");
        panelPinc.add(emailLabel,
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,0),
                        0,
                        0
                ));

        JTextField email = new JTextField();
        panelPinc.add(email,
                new GridBagConstraints(
                        1,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.WEST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,30),
                        0,
                        0
                ));

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        panelPinc.add(contraseñaLabel,
                new GridBagConstraints(
                        0,
                        5,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,0),
                        0,
                        0
                ));

        JPasswordField contraseña = new JPasswordField();
        panelPinc.add(contraseña,
                new GridBagConstraints(
                        1,
                        5,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.WEST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,30),
                        0,
                        0
                ));

        JButton boton = new JButton("Enviar");
        panelPinc.add(boton,
                new GridBagConstraints(
                        2,
                        6,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,20),
                        0,
                        0
                ));

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nombre.getText();
                String apell = apellido.getText();
                String nif = dni.getText();
                String mail = email.getText();



                    tab.añadir(new Estudiantes("123456","David", "Montejano",21));
                    tab.fireTableDataChanged();
            }
        });


        JTable tabla = new JTable();
        panelPinc.add(tabla);


        ventana.add(panelPinc);




    }
}
