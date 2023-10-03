package PruebaDeCasa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Formulario extends JFrame {
    public static JTextField TextUsuario;

    public static void main(String[] args) {

        //Creamos el objeto de la clase JFrame
        JFrame ventana = new JFrame();
        //Usamos el metodo setBounds para dar las cordenadas y tamanyo a la ventana
        ventana.setBounds(10, 10, 400, 400);
        //Usamos el metodo setVisible para darle visibilidad a la ventana
        ventana.setVisible(true);
        //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPirn = new JPanel();
        panelPirn.setBounds(0, 0, 400, 400);
        panelPirn.setBorder(BorderFactory.createTitledBorder(""));
        panelPirn.setLayout(new GridBagLayout());

        JLabel nombre = new JLabel("Full name");
        panelPirn.add(nombre,
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 5),
                        0,
                        0
                ));

        JTextField TextNombre = new JTextField();
        panelPirn.add(TextNombre,
                new GridBagConstraints(
                        1,
                        0,
                        3,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 10),
                        0,
                        0
                ));

        JLabel street = new JLabel("Street");
        panelPirn.add(street,
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                ));

        JLabel city = new JLabel("City");
        panelPirn.add(city,
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                ));

        JLabel zipCode = new JLabel("Zip code");
        panelPirn.add(zipCode,
                new GridBagConstraints(
                        3,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                ));

        JLabel address = new JLabel("Addres");
        panelPirn.add(address,
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 5),
                        0,
                        0
                ));

        JTextField TextStreet = new JTextField(30);
        panelPirn.add(TextStreet,
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 5),
                        0,
                        0
                ));

        JTextField TextCity = new JTextField(15);
        panelPirn.add(TextCity,
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 5, 0, 0),
                        0,
                        0
                ));

        JTextField TextZipCode = new JTextField(6);
        panelPirn.add(TextZipCode,
                new GridBagConstraints(
                        3,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 5, 0, 10),
                        0,
                        0
                ));

        JLabel phone = new JLabel("phone");
        panelPirn.add(phone,
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 5),
                        0,
                        0
                ));

        JTextField TextPhone = new JTextField(15);
        panelPirn.add(TextPhone,
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        5,
                        0
                ));

        JLabel age = new JLabel("age");
        panelPirn.add(age,
                new GridBagConstraints(
                        2,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 5),
                        0,
                        0
                ));

        JTextField TextAge = new JTextField(6);
        panelPirn.add(TextAge,
                new GridBagConstraints(
                        3,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 10),
                        5,
                        0
                ));

        JLabel Description = new JLabel("Description");
        panelPirn.add(Description,
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 5),
                        0,
                        0
                ));

        JTextArea TextDescription = new JTextArea();
        panelPirn.add(TextDescription,
                new GridBagConstraints(
                        1,
                        4,
                        3,
                        1,
                        1.0,
                        3.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 10),
                        0,
                        0
                ));

        JButton submit = new JButton("Submit");
        panelPirn.add(submit,
                new GridBagConstraints(
                        2,
                        5,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 10, 10),
                        0,
                        0
                )
        );

        ventana.add(panelPirn);
    }
}
