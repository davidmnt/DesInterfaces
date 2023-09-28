import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiCalculadora {

    private static boolean inicio;

    public static void main(String[] args) {
        inicio = true;

        //Creamos el objeto de la clase JFrame
        JFrame ventana = new JFrame();
        //Usamos el metodo setBounds para dar las cordenadas y tamanyo a la ventana
        ventana.setBounds(10, 10, 350, 400);
        //Usamos el metodo setVisible para darle visibilidad a la ventana
        ventana.setVisible(true);
        //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel titulo = new JLabel("CALCULADORA");

        JPanel panelPantalla = new JPanel();
        panelPantalla(panelPantalla);

        JPanel panelBotones = new JPanel();
        panelBotones(panelBotones);

        ventana.add(panelPantalla, BorderLayout.NORTH);
        ventana.add(panelBotones,BorderLayout.CENTER);




    }

    private static void panelPantalla(JPanel panelPantalla ){

        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);
        panelPantalla.add(pantalla);
    }

    private static void panelBotones(JPanel panelBotones){

        panelBotones.setLayout(new GridLayout(5,4,5,5));

        JButton boton7 = new JButton("7");
        panelBotones.add(boton7);

        JButton boton8 = new JButton("8");
        panelBotones.add(boton8);

        JButton boton9 = new JButton("9");
        panelBotones.add(boton9);

        JButton botonDividir = new JButton("/");
        panelBotones.add(botonDividir);

        JButton boton4 = new JButton("4");
        panelBotones.add(boton4);

        JButton boton5 = new JButton("5");
        panelBotones.add(boton5);

        JButton boton6 = new JButton("6");
        panelBotones.add(boton6);

        JButton botonMulti = new JButton("*");
        panelBotones.add(botonMulti);

        JButton boton1 = new JButton("1");
        panelBotones.add(boton1);

        JButton boton2 = new JButton("2");
        panelBotones.add(boton2);

        JButton boton3 = new JButton("3");
        panelBotones.add(boton3);

        JButton botonResta = new JButton("-");
        panelBotones.add(botonResta);

        JButton botonComa = new JButton(",");
        panelBotones.add(botonComa);

        JButton boton0 = new JButton("0");
        panelBotones.add(boton0);

        JButton botonSuma = new JButton("+");
        panelBotones.add(botonSuma);


        JButton botonIgual = new JButton("=");
        panelBotones.add(botonIgual);

        JButton botonBorrar = new JButton("AC");
        panelBotones.add(botonBorrar);

    }

   /* private static ActionListener accionBotones(JButton pantalla){

        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = e.getActionCommand();

                if(inicio){
                 pantalla.setText("");
                 inicio = false;
                }

                pantalla.setText(pantalla.getText() + entrada);

            }
        };
        return ac;
    }
*/





}
