package Tablas;

import javax.management.Query;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class GuardarDatos {

    static JTextField nombre;
    static JTextField apellido;
    static JTextField dni;
    static JTextField email;
    static JPasswordField contraseña;
    static int idDatos = 0;

    public static void main(String[] args) throws SQLException {


        Connection conn = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/Desarrollo", "root", "admin");

        if (conn != null) {
            System.out.println("Conexión exitosa a MySQL");
            // Puedes realizar operaciones con la base de datos aquí
        } else {
            System.out.println("No se pudo conectar a MySQL");
        }


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
        panelPinc.setBounds(1, 1, 700, 850);

        JLabel titulo = new JLabel("Registro de usuarios");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
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
                        new Insets(0, 0, 0, 0),
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
                        new Insets(0, 0, 0, 0),
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
                        new Insets(0, 20, 0, 0),
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
                        new Insets(0, 0, 0, 30),
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
                        new Insets(0, 20, 0, 0),
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
                        new Insets(0, 0, 0, 30),
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
                        new Insets(0, 20, 0, 0),
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
                        new Insets(0, 0, 0, 30),
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
                        new Insets(0, 20, 0, 0),
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
                        new Insets(0, 0, 0, 30),
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
                        new Insets(0, 20, 0, 0),
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
                        new Insets(0, 00, 0, 30),
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
                        new Insets(0, 20, 0, 20),
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
                        new Insets(0, 20, 0, 20),
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
                        new Insets(0, 20, 0, 20),
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
                        new Insets(0, 20, 0, 20),
                        0,
                        0
                ));


        String queryResult = "SELECT * FROM USUARIOS";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(queryResult);

        while (rs.next()) {
            idDatos = rs.getInt(1);
            String pass = "";

            if (rs.getString(6).equals("null")) {
                pass = " ";
            } else {
                pass = "******";
            }

            String[] arrTabla = {String.valueOf(rs.getInt(1)), rs.getString(2), rs.getString(3)
                    , rs.getString(4), rs.getString(5), pass};
            modelo.addRow(arrTabla);
        }


        botonAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "INSERT INTO USUARIOS VALUES(?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);
                    String name = nombre.getText();
                    String apell = apellido.getText();
                    String nif = dni.getText();
                    String mail = email.getText();
                    String pass = String.valueOf(contraseña.getPassword());

                    if (!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && nif.isEmpty() && !pass.isEmpty()) {
                        String[] obj = {String.valueOf(idDatos), name, apell, "", mail, "*************"};
                        ps.setString(6, pass);
                        ps.setString(4, "null");
                        modelo.addRow(obj);
                        idDatos++;
                        vaciarTF();

                    } else if (!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && !nif.isEmpty() && pass.isEmpty()) {
                        String[] obj = {String.valueOf(idDatos), name, apell, nif, mail, " "};
                        ps.setString(6, "null");
                        ps.setString(4, nif);
                        modelo.addRow(obj);
                        idDatos++;
                        vaciarTF();

                    } else if (!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && !nif.isEmpty() && !pass.isEmpty()) {
                        String[] obj = {String.valueOf(idDatos), name, apell, nif, mail, "********"};
                        ps.setString(6, pass);
                        ps.setString(4, nif);
                        modelo.addRow(obj);
                        idDatos++;
                        vaciarTF();

                    } else if (!name.isEmpty() && !apell.isEmpty() && !mail.isEmpty() && nif.isEmpty() && pass.isEmpty()) {
                        String[] obj = {String.valueOf(idDatos), name, apell, " ", mail, " "};
                        ps.setString(6, "null");
                        ps.setString(4, "null");
                        modelo.addRow(obj);
                        idDatos++;
                        vaciarTF();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al introducir variables en la tabla, por favor introduce datos");
                    }

                    ps.setInt(1, idDatos);
                    ps.setString(2, name);
                    ps.setString(3, apell);
                    ps.setString(5, mail);

                    ps.execute();

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
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
                        new Insets(0, 5, 0, 5),
                        0,
                        0
                ));

        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idBorrar = tabla.getSelectedRow();
                String idUser = (String) tabla.getValueAt(idBorrar, 0);
                int id = Integer.parseInt(idUser);

                try {
                    modelo.removeRow(idBorrar);
                    String query = "DELETE FROM USUARIOS WHERE id = ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setInt(1, id);
                    ps.execute();
                } catch (ArrayIndexOutOfBoundsException exce) {
                    JOptionPane.showMessageDialog(null, "Seleciona una persona para eliminar");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });

        botonMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int idMod = tabla.getSelectedRow();
                int id = (int) tabla.getValueAt(idMod,0);
                int cont = 0;
                String nombreIntroducido = "";
                String apellidoIntroducido = "";
                String dniIntroducido = "";
                String mailIntroducido = "";
                String passIntroducido = "";
                String nombreCambiar = "";
                String apellidoCambiar = "";
                String dniCambiar = "";
                String mailCambiar = "";
                String passCambiar = "";

                try {
                    String query = "";
                    PreparedStatement ps = null;
                    if (cont == 0) {

                         nombreCambiar = nombre.getText();
                         apellidoCambiar = apellido.getText();
                         dniCambiar = dni.getText();
                         mailCambiar = email.getText();
                         passCambiar = contraseña.toString();

                        nombreIntroducido = (String) tabla.getValueAt(idMod, 1);
                        apellidoIntroducido = (String) tabla.getValueAt(idMod, 2);
                        dniIntroducido = (String) tabla.getValueAt(idMod, 3);
                        mailIntroducido = (String) tabla.getValueAt(idMod, 4);
                        passIntroducido = (String) tabla.getValueAt(idMod, 5);

                        nombre.setText(nombreIntroducido);
                        apellido.setText(apellidoIntroducido);
                        dni.setText(dniIntroducido);
                        email.setText(mailIntroducido);
                        contraseña.setText(passIntroducido);
                        cont = 1;
                    }

                    if (cont == 1) {

                        tabla.setValueAt(nombreCambiar, idMod, 1);

                        query = "UPDATE USUARIOS SET nombre = ? WHERE id = ?";
                        ps = conn.prepareStatement(query);

                        ps.setString(1, nombreCambiar);
                        ps.setString(2, String.valueOf(idMod));
                        ps.execute();


                        tabla.setValueAt(apellidoCambiar, idMod, 2);

                        query = "UPDATE USUARIOS SET apellidos = ? WHERE id = ?";
                        ps = conn.prepareStatement(query);

                        ps.setString(1, apellidoCambiar);
                        ps.setString(2, id);
                        ps.execute();


                        tabla.setValueAt(dniCambiar, idMod, 3);

                        query = "UPDATE USUARIOS SET dni = ? WHERE id = ?";
                        ps = conn.prepareStatement(query);

                        ps.setString(1, dniCambiar);
                        ps.setString(2, String.valueOf(idMod));
                        ps.execute();


                        tabla.setValueAt(mailCambiar, idMod, 4);

                        query = "UPDATE USUARIOS SET Mail = ? WHERE id = ?";
                        ps = conn.prepareStatement(query);

                        ps.setString(1, mailCambiar);
                        ps.setString(2, String.valueOf(idMod));
                        ps.execute();


                        tabla.setValueAt(passCambiar, idMod, 5);

                        query = "UPDATE USUARIOS SET pass = ? WHERE id = ?";
                        ps = conn.prepareStatement(query);

                        ps.setString(1, passCambiar);
                        ps.setString(2, String.valueOf(idMod));
                        ps.execute();
                        cont = 0;


                    }

                }catch(ArrayIndexOutOfBoundsException exce){
                    JOptionPane.showMessageDialog(null, "Seleciona una persona para eliminar");
                }catch(SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        ventana.add(panelPinc, BorderLayout.CENTER);

    }

    private static void vaciarTF() {
        nombre.setText("");
        apellido.setText("");
        dni.setText("");
        email.setText("");
        contraseña.setText("");
    }

}