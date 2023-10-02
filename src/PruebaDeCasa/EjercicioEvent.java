package PruebaDeCasa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjercicioEvent {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0,0,500,500);

        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panelPirn = new JPanel();
        panelPirn.setBounds(0,0,250,250);
        panelPirn.setLayout(new GridBagLayout());

        JLabel lblList = new JLabel("JList");
        lblList.addMouseListener(color(lblList));
        lblList.setFont(new Font("Arial",Font.PLAIN,30));
        lblList.setBorder(BorderFactory.createLoweredBevelBorder());
        panelPirn.add(lblList,
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(10,20,0,0),
                        0,
                        0
                ));

        JTextField añadir = new JTextField(20);
        panelPirn.add(añadir,
                new GridBagConstraints(
                        0,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.CENTER,
                        new Insets(0,0,0,0),
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
                        new Insets(0,0,0,5),
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
