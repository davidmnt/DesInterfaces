import javax.swing.*;
import java.awt.*;

public class MasComponentes {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setBounds(0,0,500,500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setBounds(0,0,500,500);
        panel.setLayout(new GridBagLayout());

        JLabel title = new JLabel("Formulario:");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(title,
                new GridBagConstraints(
                        0,
                        0,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.VERTICAL,
                        new Insets(0,10,0,0),
                        0,
                        0
                ));

        JLabel Usuario = new JLabel("User:");
        panel.add(Usuario,
                new GridBagConstraints(
                        0,
                        1,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.VERTICAL,
                        new Insets(0,10,0,0),
                        0,
                        0
                ));

        JTextField TextUsuario = new JTextField();
        panel.add(TextUsuario,
                new GridBagConstraints(
                        1,
                        1,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,10),
                        0,
                        5
                ));

        JLabel pass = new JLabel("Pass:");
        panel.add(pass,
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.VERTICAL,
                        new Insets(0,10,0,0),
                        0,
                        0
                ));

        JPasswordField TextPass = new JPasswordField();
        panel.add(TextPass,
                new GridBagConstraints(
                        1,
                        2,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,10),
                        0,
                        5
                ));

        JLabel nacionalidad = new JLabel("nacionalidad:");
        panel.add(nacionalidad,
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.VERTICAL,
                        new Insets(0,10,0,0),
                        0,
                        0
                ));

        JList<String> nacionalidadList = new JList<String>();
        panel.add(nacionalidadList,
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,10,10),
                        0,
                        0
                ));
        String[] lista = {"España","Francia","Alemania","Marruecos","Ucrania","Otros"};
        nacionalidadList.setListData(lista);

        JLabel SobreMi = new JLabel("Sobre Mi:");
        panel.add(SobreMi,
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.VERTICAL,
                        new Insets(0,10,0,0),
                        0,
                        0
                ));

        JTextArea TextSobreMi = new JTextArea();
        panel.add(TextSobreMi,
                new GridBagConstraints(
                        1,
                        4,
                        1,
                        1,
                        1.0,
                        3.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,10),
                        0,0
                        ));

        JLabel Estudio = new JLabel("Estudios:");
        panel.add(Estudio,
                new GridBagConstraints(
                        0,
                        5,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.VERTICAL,
                        new Insets(0,10,0,0),
                        0,
                        0
                ));

        JList<String> TextEstudio = new JList<>();
        String[] estudios = {"DAM","DAW","ASIR","INEF","CAFE","TAFAD","TSEAS","TSAF","TECO","RN","PhD","MSc","Otros"};
        TextEstudio.setListData(estudios);
        JScrollPane scrollPane = new JScrollPane(TextEstudio);
        panel.add(scrollPane,
                new GridBagConstraints(
                        1,
                        5,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(10,0,0,10),
                        0,0
                ));

        JButton enviar = new JButton("Enviar");
        enviar.setBackground(Color.white);
        panel.add(enviar,
                new GridBagConstraints(
                        0,
                        6,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,10,5,10),
                        0,
                        0
                        ));

        ventana.add(panel);
    }
}
