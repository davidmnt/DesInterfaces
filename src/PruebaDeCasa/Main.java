package PruebaDeCasa;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        JFrame primeraVentana = new JFrame();
        JPanel panelPrincipal = new JPanel();

        primeraVentana.setBounds(10,10,300,200);
        primeraVentana.setVisible(true);
        primeraVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panelPrincipal.setLayout(new GridBagLayout());





        panelPrincipal.add(new JLabel("Usuario:"),
        new GridBagConstraints(0,0,1,1,1.0,1.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,
        new Insets(0,0,0,0),0,0));

        panelPrincipal.add(new JTextField(20));

       panelPrincipal.add(
                new JButton("Enviar"),
                        new GridBagConstraints(1,2,2,1,1.0,1.0,GridBagConstraints.SOUTH,GridBagConstraints.HORIZONTAL,
                                new Insets(0,0,0,0),0,0));
      /*  panelPrincipal.add(
                new JButton("BOTON 2"),
                new GridBagConstraints(1,0,1,1,1.0,1.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),0,0));
        panelPrincipal.add(
                new JButton("BOTON 3"),
                new GridBagConstraints(2,0,1,1,1.0,1.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),0,0));*/

        primeraVentana.setContentPane(panelPrincipal);





    }

}