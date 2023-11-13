package Tablas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuardarDatos {

    static JTextField nombre;
    static JTextField apellido;
    static JTextField dni;
    static JTextField email;
    static JPasswordField contraseña;
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
        panelPinc.setBounds(1,1,700,850);

        JLabel titulo = new JLabel("Registro de usuarios");
        titulo.setFont(new Font("Arial", Font.BOLD,20));
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
        JLabel id = new JLabel("ID");
        panelPinc.add(id,
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));

        JLabel nombreLabel = new JLabel("*Nombre:");
        panelPinc.add(nombreLabel,
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

        nombre = new JTextField();
        panelPinc.add(nombre,
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

        JLabel apellidoLabel = new JLabel("*Apellido:");
        panelPinc.add(apellidoLabel,
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

        apellido = new JTextField();
        panelPinc.add(apellido,
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

        JLabel dniLabel = new JLabel("Dni:");
        panelPinc.add(dniLabel,
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

        dni = new JTextField();
        panelPinc.add(dni,
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

        JLabel emailLabel = new JLabel("*Email:");
        panelPinc.add(emailLabel,
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

        email = new JTextField();
        panelPinc.add(email,
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

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        panelPinc.add(contraseñaLabel,
                new GridBagConstraints(
                        0,
                        6,
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

        contraseña = new JPasswordField();
        panelPinc.add(contraseña,
                new GridBagConstraints(
                        1,
                        6,
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


        JButton botonAñadir = new JButton("Introducir");
        panelPinc.add(botonAñadir,
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,20),
                        10,
                        0
                ));

        JButton botonEliminar = new JButton("Eliminar");
        panelPinc.add(botonEliminar,
                new GridBagConstraints(
                        2,
                        3,
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
                        2,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,20,0,20),
                        10,
                        0
                ));

        JButton botonMod = new JButton("Modificar");
        panelPinc.add(botonMod,
                new GridBagConstraints(
                        2,
                        5,
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

                String name = nombre.getText();
                String apell = apellido.getText();
                String nif = dni.getText();
                String mail = email.getText();
                String pass = String.valueOf(contraseña.getPassword());

                if(!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && nif.isEmpty() && !pass.isEmpty()){

                    String[] obj = {String.valueOf(idDatos),name, apell,"",mail,"True"};
                    modelo.addRow(obj);
                    idDatos++;
                    vaciarTF();

                } else if(!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && !nif.isEmpty() && pass.isEmpty()){
                    String[] obj = {String.valueOf(idDatos),name, apell,nif,mail,"False"};
                    modelo.addRow(obj);
                    idDatos++;
                    vaciarTF();

                }else if(!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && !nif.isEmpty() && !pass.isEmpty()){
                    String[] obj = {String.valueOf(idDatos),name, apell,nif,mail,"True"};
                    modelo.addRow(obj);
                    idDatos++;
                    vaciarTF();

                }else if(!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && nif.isEmpty() && pass.isEmpty()) {
                String[] obj = {String.valueOf(idDatos), name, apell, " ", mail, "False"};
                modelo.addRow(obj);
                idDatos++;
                vaciarTF();
            }else {
                    JOptionPane.showMessageDialog( null,"Error al introducir variables en la tabla, por favor introduce datos");
                }
            }
        });

        botonNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaciarTF();
            }
        });

        JTable tabla = new JTable(modelo);
        JScrollPane js = new JScrollPane(tabla);
        panelPinc.add(js,
                new GridBagConstraints(
                        0,
                        7,
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

             try {
                 modelo.removeRow(idBorrar);
             }catch (ArrayIndexOutOfBoundsException exce) {
                 JOptionPane.showMessageDialog( null,"Seleciona una persona para eliminar");
             }


            }
        });

        botonMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int idMod = tabla.getSelectedRow();
                try {

                    String nombreCambiar = nombre.getText();
                    String apellidoCambiar = apellido.getText();
                    String dniCambiar = dni.getText();
                    String mailCambiar = email.getText();
                    String passCambiar = contraseña.toString();

                    String nombreIntroducido = (String) tabla.getValueAt(idMod,1);
                    String apellidoIntroducido = (String) tabla.getValueAt(idMod,2);
                    String dniIntroducido = (String) tabla.getValueAt(idMod,3);
                    String mailIntroducido = (String) tabla.getValueAt(idMod,4);
                    String passIntroducido = (String) tabla.getValueAt(idMod,5);


                    for(int i=0;i<tabla.getRowCount();i++) {

                        if (!nombreCambiar.equals(nombreIntroducido)) {
                            tabla.setValueAt(nombreCambiar, idMod, 1);
                        }

                        if (!apellidoCambiar.equals(apellidoIntroducido)) {
                            tabla.setValueAt(apellidoCambiar, idMod, 2);
                        }

                        if (!dniCambiar.equals(dniIntroducido)) {
                            tabla.setValueAt(dniCambiar, idMod, 3);
                        }

                        if (!mailCambiar.equals(mailIntroducido)) {
                            tabla.setValueAt(mailCambiar, idMod, 4);
                        }

                        if (!passCambiar.equals(passIntroducido)) {
                            tabla.setValueAt(passCambiar, idMod, 5);
                        }

                    }

            }catch (ArrayIndexOutOfBoundsException exce) {
                JOptionPane.showMessageDialog( null,"Seleciona una persona para eliminar");
            }

            }
        });

        ventana.add(panelPinc, BorderLayout.CENTER);

    }

    private static void vaciarTF(){
        nombre.setText("");
        apellido.setText("");
        dni.setText("");
        email.setText("");
        contraseña.setText("");
    }

}