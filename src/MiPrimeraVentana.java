import javax.swing.*;
import java.awt.*;

public class MiPrimeraVentana {

    public static void main(String[] args) {

        //Creamos el objeto de la clase JFrame
        JFrame ventana = new JFrame();
        //Usamos el metodo setBounds para dar las cordenadas y tamanyo a la ventana
        ventana.setBounds(10, 10, 250, 250);
        //Usamos el metodo setVisible para darle visibilidad a la ventana
        ventana.setVisible(true);
        //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBounds(10, 10, 200, 200);

       /* //Disposicion del panel de la clase FlowLayout

        FlowLayout disposicionFlow = new FlowLayout(FlowLayout.LEFT,10,10); //hgap distancia entre los objetos y vgap distancia del borde de la ventana
        panelPrincipal.setLayout(disposicionFlow); */

        //Disposicion del panel de la clase BorderLayout
        panelPrincipal.setLayout(new BorderLayout());
        //panelPrincipal.setLayout(new GridBagLayout());


        JLabel nombre = new JLabel("Nombre:");
        JTextField TextNombre = new JTextField(15);


        JLabel apellidos = new JLabel("apellidos:");
        JTextField TextApellidos = new JTextField(15);


        JLabel sexo = new JLabel("Sexo:");
        JComboBox<String> ComboSexo = new JComboBox<>();
        ComboSexo.addItem("Hombre");
        ComboSexo.addItem("Mujer");
        ComboSexo.addItem("Otro");

        JLabel nacionalidad = new JLabel("Nacionalidad:");
        JComboBox<String> ComboNacionalidad = new JComboBox<>();
        ComboNacionalidad.addItem("España");
        ComboNacionalidad.addItem("Alemania");
        ComboNacionalidad.addItem("Suiza");
        ComboNacionalidad.addItem("Otro");

        JLabel FechaNac = new JLabel("Fecha de nacimiento:");
        JTextField TextFechaNac = new JTextField(15);


        JLabel Domicilio = new JLabel("Domicilio:");
        JTextField TextDomicilio = new JTextField(15);


        JButton BotonEnviar = new JButton("Enviar");


        //Apellidos
        panelPrincipal.add(apellidos);
        panelPrincipal.add(TextApellidos);

        //Nombre
        panelPrincipal.add(nombre);
        panelPrincipal.add(TextNombre);

        //Sexo
        panelPrincipal.add(sexo);
        panelPrincipal.add(ComboSexo);

        //Nacionalidad
        panelPrincipal.add(nacionalidad);
        panelPrincipal.add(ComboNacionalidad);

        //FechaNac
        panelPrincipal.add(FechaNac);
        panelPrincipal.add(TextFechaNac);

        //Domicilio
        panelPrincipal.add(Domicilio);
        panelPrincipal.add(TextDomicilio);

        //Boton de enviar
        panelPrincipal.add(BotonEnviar, BorderLayout.SOUTH);

        //Añadimos el panel con sus componentes a la ventana principal
        ventana.setContentPane(panelPrincipal);


    }


}
