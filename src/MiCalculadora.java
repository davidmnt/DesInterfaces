import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MiCalculadora {


    private static boolean inicio;
    private static JTextField pantalla;
    private static ArrayList<Double> ArrayNumeros;
    private static Double numDouble;
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

        panelPantalla.setLayout(new FlowLayout(FlowLayout.CENTER));
        pantalla = new JTextField(27);
        panelPantalla.setBounds(10,10,350,400);
        pantalla.setEnabled(false);

        panelPantalla.add(pantalla);
    }
    private static void panelBotones(JPanel panelBotones){

        panelBotones.setLayout(new GridLayout(5,4,10,10));
        panelBotones.setBounds(10,10,350,400);

        JButton boton7 = new JButton("7");
        boton7.setBackground(Color.white);
        panelBotones.add(boton7);
        boton7.addActionListener(accionBotones(pantalla));

        JButton boton8 = new JButton("8");
        boton8.setBackground(Color.white);
        panelBotones.add(boton8);
        boton8.addActionListener(accionBotones(pantalla));

        JButton boton9 = new JButton("9");
        boton9.setBackground(Color.white);
        panelBotones.add(boton9);
        boton9.addActionListener(accionBotones(pantalla));

        JButton botonDividir = new JButton("/");
        botonDividir.setBackground(Color.ORANGE);
        panelBotones.add(botonDividir);
        botonDividir.addActionListener(accionBotones(pantalla));

        JButton boton4 = new JButton("4");
        boton4.setBackground(Color.white);
        panelBotones.add(boton4);
        boton4.addActionListener(accionBotones(pantalla));

        JButton boton5 = new JButton("5");
        boton5.setBackground(Color.white);
        panelBotones.add(boton5);
        boton5.addActionListener(accionBotones(pantalla));

        JButton boton6 = new JButton("6");
        boton6.setBackground(Color.white);
        panelBotones.add(boton6);
        boton6.addActionListener(accionBotones(pantalla));

        JButton botonMulti = new JButton("*");
        botonMulti.setBackground(Color.ORANGE);
        panelBotones.add(botonMulti);
        botonMulti.addActionListener(accionBotones(pantalla));

        JButton boton1 = new JButton("1");
        boton1.setBackground(Color.white);
        panelBotones.add(boton1);
        boton1.addActionListener(accionBotones(pantalla));

        JButton boton2 = new JButton("2");
        boton2.setBackground(Color.white);
        panelBotones.add(boton2);
        boton2.addActionListener(accionBotones(pantalla));

        JButton boton3 = new JButton("3");
        boton3.setBackground(Color.white);
        panelBotones.add(boton3);
        boton3.addActionListener(accionBotones(pantalla));

        JButton botonResta = new JButton("-");
        botonResta.setBackground(Color.ORANGE);
        panelBotones.add(botonResta);
        botonResta.addActionListener(accionBotones(pantalla));

        JButton botonComa = new JButton(",");
        botonComa.setBackground(Color.white);
        panelBotones.add(botonComa);
        botonComa.addActionListener(accionBotones(pantalla));

        JButton boton0 = new JButton("0");
        boton0.setBackground(Color.white);
        panelBotones.add(boton0);
        boton0.addActionListener(accionBotones(pantalla));

        JButton botonSuma = new JButton("+");
        botonSuma.setBackground(Color.ORANGE);
        panelBotones.add(botonSuma);
        botonSuma.addActionListener(accionBotones(pantalla));

        JButton botonIgual = new JButton("=");
        botonIgual.setBackground(Color.ORANGE);
        panelBotones.add(botonIgual);
       botonIgual.addActionListener(accionBotonIgual(pantalla));

        JButton MasMenos = new JButton("+/-");
        MasMenos.setBackground(Color.ORANGE);
        panelBotones.add(MasMenos);
        MasMenos.addActionListener(accionBotonAC(pantalla));

        JButton porcentaje = new JButton("%");
        porcentaje.setBackground(Color.ORANGE);
        panelBotones.add(porcentaje);
        porcentaje.addActionListener(accionBotonAC(pantalla));

        JButton botonBorrar = new JButton("AC");
        botonBorrar.setBackground(Color.ORANGE);
        panelBotones.add(botonBorrar);
        botonBorrar.addActionListener(accionBotonAC(pantalla));

        JButton raizCuadrada = new JButton("√ ");
        raizCuadrada.setBackground(Color.ORANGE);
        panelBotones.add(raizCuadrada);
        // raizCuadrada.addActionListener(accionBotonRaizCuadrada(pantalla));
    }

   private static ActionListener accionBotones(JTextField pantalla){

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
    private static ActionListener accionBotonSigno(JTextField pantalla){

        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String signo = e.getActionCommand();
                String num = pantalla.getText().toString();
                 numDouble = Double.parseDouble(num);


                switch (signo){
                    case "+":  pantalla.setText(pantalla.getText() + "+");break;
                    case "-":  pantalla.setText(pantalla.getText() + "-");break;
                    case "*":  pantalla.setText(pantalla.getText() + "*");break;
                    case "/":  pantalla.setText(pantalla.getText() + "/");
                }

            }
        };
        return ac;
    }

    private static ActionListener accionBotonAC(JTextField pantalla){

        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pantalla.setText("");

            }
        };
        return ac;
    }


    private static ActionListener accionBotonIgual(JTextField pantalla){

        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double result = 0;
                int contTotal = 0;
                char operacion = 0;
                String num1 = "";
                String num2 = "";

                //pasamos el numero a un Array de char
                char[] numChar = pantalla.getText().toString().toCharArray();

                //Hacemos un bucle para sacar el primer numero hasta el signo de operacion

                for (int i = 0; i < numChar.length; i++) {
                    //Forzamos un break para una vez llegado al signo pare de concatenar numeros al num1
                    if (numChar[i] == '+' || numChar[i] == '-' || numChar[i] == '*' || numChar[i] == '/') {
                        operacion = pantalla.getText().toString().charAt(contTotal);
                        break;
                    }
                    //Mientras el bucle no detecte un signo de operacion va a concatenar el numero y sumar el contador
                    if (numChar[i] != '+' || numChar[i] != '-' || numChar[i] != '*' || numChar[i] != '/') {
                        num1 += pantalla.getText().toString().charAt(i);
                        contTotal++;
                    }
                }


                //Luego hacemos otro bucle para para sacra el num2 inicializando el cont del for anterior +1
                for (int i = contTotal + 1; i < numChar.length; i++) {
                    num2 += String.valueOf(pantalla.getText().toString().charAt(i));
                }


                //En caso de que alguno de los numeros este vacio lanzaremos un error a la app

                    //Pasamos los numeros de String a int
                    double numero1 = Double.parseDouble(num1);
                    double numero2 = Double.parseDouble(num2);
                    //Metemos en una variable el signo, que lo sacamos gracias al contador, ya que forzamos con un break el bucle para que pare cuando
                    //llegue a un signo, lo que significa que si el numero1 es 12+ el contador sera igual a 2.


                    //Segun el signo hacemos la operacion correspondiente
                    switch (operacion) {
                        case '+':
                            result = numero1 + numero2;
                            break;
                        case '-':
                            result = numero1 - numero2;
                            break;
                        case '/':
                            result = numero1 / numero2;
                            break;
                        case '*':
                            result = numero1 * numero2;
                    }

                    //Pasamos el resultado double a String para pasarlo por pantalla
                    String resultado = "" + result;

                    pantalla.setText(resultado);

            }
        };
        return ac;
    }






}
