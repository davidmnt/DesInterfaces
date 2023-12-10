package Exam.controlador;

import Exam.modelo.conM;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class PruebaForm {
    private JTextField userField;
    static conM c = null;
    private JTextField MailField;
    private JTextField dniField;
    private JTable ta;
    private JLabel user;
    private JLabel pass;
    private JLabel mail;
    private JLabel dni;
    private JPanel panelPrin;
    private JScrollPane js;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton botonEnviar;
    private JPasswordField passField;
    private int idDatos;

    PruebaForm(){

        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("id");
        m.addColumn("nombre");
        m.addColumn("dni");
        m.addColumn("email");
        m.addColumn("contraseña");

        ta.setModel(m);

        botonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = userField.getText();
                String nif = dniField.getText();
                String mail = MailField.getText();
                String pass = String.valueOf(passField.getPassword());

                if(!name.isEmpty() && !mail.isEmpty() && nif.isEmpty() && !pass.isEmpty()){

                    String[] obj = {String.valueOf(idDatos),name, "",mail,"True"};
                    m.addRow(obj);
                    idDatos++;
                    try {
                        c.introducirPene(name,pass);
                    } catch (SQLException ex) {
                        ex.getMessage();
                    }

                } else if(!name.isEmpty() && !mail.isEmpty() && !nif.isEmpty() && pass.isEmpty()){
                    String[] obj = {String.valueOf(idDatos),name,nif,mail,"False"};
                    m.addRow(obj);
                    idDatos++;
                    try {
                        c.introducirPene(name,pass);
                    } catch (SQLException ex) {
                        ex.getMessage();
                    }


                }else if(!name.isEmpty() && !mail.isEmpty() && !nif.isEmpty() && !pass.isEmpty()){
                    String[] obj = {String.valueOf(idDatos),name,nif,mail,"True"};
                    m.addRow(obj);
                    idDatos++;
                    try {
                        c.introducirPene(name,pass);
                    } catch (SQLException ex) {
                        ex.getMessage();
                    }


                }else if(!name.isEmpty() && !mail.isEmpty() && nif.isEmpty() && pass.isEmpty()) {
                    String[] obj = {String.valueOf(idDatos), name,  " ", mail, "False"};
                    m.addRow(obj);
                    idDatos++;
                    try {
                        c.introducirPene(name,pass);
                    } catch (SQLException ex) {
                        ex.getMessage();
                    }

                }else {
                    JOptionPane.showMessageDialog( null,"Error al introducir variables en la tabla, por favor introduce datos");
                }



            }
        });
    }





    public static void main(String[] args) {
         c = new conM();
        JFrame frame = new JFrame("PruebaForm");
        frame.setBounds(0,0,550,500);
        frame.setContentPane(new PruebaForm().panelPrin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
