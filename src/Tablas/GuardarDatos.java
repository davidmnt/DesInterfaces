package Tablas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuardarDatos {

    static int idDatos = 0;
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 700, 850);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("apellidos");
        modelo.addColumn("dni");
        modelo.addColumn("email");
        modelo.addColumn("contraseña");


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
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,00,0,30),
                        0,
                        0
                ));

        JLabel error = new JLabel();
        panelPinc.add(error,
                new GridBagConstraints(
                        1,
                        6,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,00,0,30),
                        0,
                        0
                ));

        JButton botonAñadir = new JButton("Enviar");
        panelPinc.add(botonAñadir,
                new GridBagConstraints(
                        0,
                        7,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,10),
                        10,
                        0
                ));

        JButton botonEliminar = new JButton("Eliminar");
        panelPinc.add(botonEliminar,
                new GridBagConstraints(
                        1,
                        7,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.WEST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,20),
                        0,
                        0
                ));

        JButton botonNuevo = new JButton("Nuevo");
        panelPinc.add(botonNuevo,
                new GridBagConstraints(
                        0,
                        8,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,10),
                        10,
                        0
                ));

        JButton botonMod = new JButton("Modificar");
        panelPinc.add(botonMod,
                new GridBagConstraints(
                        1,
                        8,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.WEST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,20),
                        0,
                        0
                ));

        botonAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                idDatos++;
                String name = nombre.getText();
                String apell = apellido.getText();
                String nif = dni.getText();
                String mail = email.getText();
                String pass = contraseña.getPassword().toString();

                if(!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && nif.isEmpty() || pass.isEmpty()){

                    String[] obj = {String.valueOf(idDatos),name, apell,"",mail,""};
                    modelo.addRow(obj);

                }
                if(!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && !nif.isEmpty() && !pass.isEmpty()){
                    String[] obj = {String.valueOf(idDatos),name, apell,nif,mail,pass};
                    modelo.addRow(obj);

                }else {
                    error.setText("Error al introducir variables en la tabla, por favor introduce datos");
                }
            }
        });

        botonNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre.setText("");
                apellido.setText("");
                dni.setText("");
                email.setText("");
                contraseña.setText("");
            }
        });

        JTable tabla = new JTable(modelo);
        JScrollPane js = new JScrollPane(tabla);
        panelPinc.add(js,
                new GridBagConstraints(
                        0,
                        10,
                        3,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,5,0,5),
                        0,
                        0
                ));

        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idBorrar = tabla.getSelectedRow();
                modelo.removeRow(idBorrar);
                idDatos = 0;
            }
        });

        botonMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int idMod = tabla.getSelectedRow();
                 //Terminar, la idea es hacer un switrch comparando los dat0os nuevos con los qwue ya existenm y en caso de que sean distintos cambiarlo

            }
        });


        ventana.add(panelPinc, BorderLayout.CENTER);

    }

}