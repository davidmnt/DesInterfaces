import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PasarLista {

    private static DefaultListModel<String> modelo = new DefaultListModel();
    private static DefaultListModel<String> modelo2 = new DefaultListModel();
    private static DefaultListModel<String> modelo3 = new DefaultListModel();
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 350, 350);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.repaint();
        ventana.revalidate();

        JPanel panelPirn = new JPanel();
        panelPirn.setBounds(0, 0, 350, 350);
        panelPirn.setLayout(new GridBagLayout());

        JLabel lblList = new JLabel("JList");
        lblList.setFont(new Font("Arial", Font.BOLD, 30));
        lblList.setBorder(BorderFactory.createLoweredBevelBorder());


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
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 30, 0, 10),
                        0,
                        10
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
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 10, 0, 30),
                        0,
                        0
                ));


        JList<String> lista = new JList<>();
        JScrollPane sc = new JScrollPane(lista);
        panelPirn.add(sc,
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.BOTH,
                        new Insets(0, 30, 0, 30),
                        0,
                        0
                ));

        JButton botonDrch = new JButton(">>");
        panelPirn.add(botonDrch,
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                        ));

        JButton botonIzq = new JButton("<<");
        panelPirn.add(botonIzq,
                new GridBagConstraints(
                        1,
                        2,
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

        JList<String> lista2 = new JList<>(modelo3);
        JScrollPane sc2 = new JScrollPane(lista2);
        panelPirn.add(sc2,
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.BOTH,
                        new Insets(0, 30, 0, 30),
                        0,
                        0
                ));



        JButton BorrarLista = new JButton("Borrar Lista");
        panelPirn.add(BorrarLista,
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 30, 10, 0),
                        0,
                        0
                ));

        JButton eliminarItem = new JButton("Eliminar");
        panelPirn.add(eliminarItem,
                new GridBagConstraints(
                        2,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 10, 10, 30),
                        0,
                        0
                ));



        JLabel Confirmacion = new JLabel();
        panelPirn.add(Confirmacion,
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 30, 10, 0),
                        0,
                        0
                ));

        agregar.addActionListener(agregar(lista, añadir,Confirmacion));
        botonDrch.addActionListener(pasarDrcha(lista,Confirmacion,lista2));
        botonIzq.addActionListener(pasarIzq(lista,Confirmacion,lista2));
        BorrarLista.addActionListener(eliminarLista(lista,Confirmacion));
        eliminarItem.addActionListener(eliminarItem(lista,Confirmacion));
        lista.addListSelectionListener(seleccion(lista,Confirmacion));
        lista2.addListSelectionListener(seleccion(lista,Confirmacion));

        ventana.add(panelPirn);
    }

    private static ListSelectionListener seleccion(JList lista, JLabel Confirmacion){
        ListSelectionListener ls = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Confirmacion.setText("Item seleccionado: " + lista.getSelectedValue());
            }
        };
        return ls;
    }

    private static ActionListener agregar(JList<String> lista, JTextField texto, JLabel Confirmacion) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String palabras = texto.getText();
                modelo.addElement(palabras);
                lista.setModel(modelo);
                texto.setText("");
            }
        };
        return ac;
    }

    private static ActionListener eliminarLista(JList<String> lista,JLabel Confirmacion) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                modelo.clear();
                Confirmacion.setText("Lista eliminada");

            }
        };
        return ac;
    }

    private static ActionListener eliminarItem(JList<String> lista,JLabel Confirmacion) {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                modelo.remove(lista.getSelectedIndex());
                Confirmacion.setText("Item eliminado");

            }
        };
        return ac;
    }
    private static ActionListener pasarDrcha(JList<String> lista,JLabel Confirmacion, JList<String> lista2){
        ActionListener sc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(lista.getSelectedIndex() == -1){
                    Confirmacion.setText("Campo vacio");
                }else{
                    String palabras = lista.getSelectedValue();
                    modelo2.addElement(palabras);
                    modelo.removeElement(palabras);
                    lista2.setModel(modelo2);

                }

            }
        };
        return sc;
    }

    private static ActionListener pasarIzq(JList<String> lista,JLabel Confirmacion, JList<String> lista2){
        ActionListener sc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(lista2.getSelectedIndex() == -1){
                    Confirmacion.setText("Campo vacio");
                }else{
                    String palabras = lista2.getSelectedValue();
                    modelo3.addElement(palabras);
                    modelo2.removeElement(palabras);
                    lista.setModel(modelo3);

                }
            }
        };
        return sc;
    }
}
