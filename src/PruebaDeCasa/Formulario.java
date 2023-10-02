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
        ventana.setBounds(10, 10, 300, 300);
        //Usamos el metodo setVisible para darle visibilidad a la ventana
        ventana.setVisible(true);
        //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panelPirn = new JPanel();
        panelPirn.setBorder(BorderFactory.createTitledBorder(""));
        panelPirn.setLayout(new GridBagLayout());

        JLabel usuario = new JLabel("Usuario:");


        panelPirn.add(usuario,
                new GridBagConstraints(
                        0,
                        0,
                        0,
                        0,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0

                ));

        TextUsuario = new JTextField();

        panelPirn.add(TextUsuario,
                new GridBagConstraints(
                        1,
                        0,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0

                ));

        JLabel contra = new JLabel("Passware:");

        panelPirn.add(contra,
                new GridBagConstraints(
                        0,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0

                ));

        JPasswordField TextPassware = new JPasswordField();

        panelPirn.add(TextPassware,
                new GridBagConstraints(
                        1,
                        1,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0

                ));

        JLabel usuario1 = new JLabel("Dni:");


        panelPirn.add(usuario1,
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0

                ));

        JTextField TextUsuario1 = new JTextField();

        panelPirn.add(TextUsuario1,
                new GridBagConstraints(
                        1,
                        2,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0, 0

                ));


        JButton enviar = new JButton("Enviar");

        panelPirn.add(enviar,
                new GridBagConstraints(
                        2,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0,
                        0


                ));
        enviar.addMouseListener(color(enviar));


        ventana.add(panelPirn);


    }

    private static MouseListener color(JButton texto) {
        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {



            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                texto.setBackground(Color.BLUE);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                texto.setBackground(Color.white);
            }
        };
        return ms;


    }


}
