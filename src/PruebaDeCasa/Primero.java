package PruebaDeCasa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primero extends javax.swing.JFrame{

    public static void main(String[] args) {


        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Primero().calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    private String cadenaNum;
    private String operacion;
    private double pirmerNum;
    private boolean activado = true;
    private boolean punto = true;
    private JPanel calculadora;
    private JTextField Resultado;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton a2Button ;
    private JButton a7Button;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a0Button ;
    private JButton sumar;
    private JButton restar;
    private JButton dividir;
    private JButton multiplicar ;
    private JButton igual;
    private  JLabel Titulo ;
    private JButton Borrar;


    public Primero() {


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + a9Button.getText());
            }
        });
        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText("");
            }
        });
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + "+");
            }
        });
        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + "-");
            }
        });
        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + "*");
            }
        });
        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.setText(Resultado.getText() + "/");
            }
        });
    }

    private void createUIComponents() {



    }
}
