package PruebaDeCasa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjercicioEvent {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0,0,500,500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPirn = new JPanel();
        panelPirn.setBounds(0,0,500,500);
        panelPirn.setLayout(new GridBagLayout());

        JLabel lblList = new JLabel("JList");
        lblList.addMouseListener(color(lblList));
        lblList.setFont(new Font("Arial", Font.BOLD, 30));
        lblList.setHorizontalAlignment(JTextField.CENTER);

        panelPirn.add(lblList);

        JTextField añadir = new JTextField();
        panelPirn.add(añadir,
                new GridBagConstraints(
                        0,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,10,0,10),
                        0,
                        0
                ));

        JButton agregar = new JButton("Agregar");
        panelPirn.add(agregar,
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,10,0,10),
                        0,
                        0
                ));


        JComboBox<String> lista = new JComboBox<>();
        //lista.setEnabled(false);
        //lista.setLineWrap(true);
        lista.setForeground(Color.BLACK);
        panelPirn.add(lista,
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,50,0,0),
                        0,
                        0
                ));

        agregar.addActionListener(agregar(lista,añadir));


        JButton BorrarLista = new JButton("Borrar Lista");
        panelPirn.add(BorrarLista,
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,10,20,5),
                        0,
                        0
                ));

        BorrarLista.addActionListener(eliminar(lista));



        ventana.add(panelPirn);



    }

    private static ActionListener agregar(JComboBox<String> lista,JTextField texto){
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palabras =texto.getText();
                lista.addItem(palabras);


               texto.setText("");


            }
        };
        return ac;
    }

    private static ActionListener eliminar(JComboBox<String>  lista){
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                lista.removeAllItems();

            }
        };
        return ac;
    }

    private static MouseListener color( JLabel lblList){
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
                lblList.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblList.setForeground(Color.BLACK);
            }
        };
        return ms;
    }

}
