import javax.swing.*;
import java.awt.*;

public class Imagen {
    public static void main(String[] args) {

        //Creamos el objeto de la clase JFrame
        JFrame ventana = new JFrame();
        //Usamos el metodo setBounds para dar las cordenadas y tamanyo a la ventana
        ventana.setBounds(10, 10, 250, 250);
        //Usamos el metodo setVisible para darle visibilidad a la ventana
        ventana.setVisible(true);
        //Usamos el metodo setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) para cuando cerremos la ventana se pare el programa
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelLogo = new JPanel();
        ImageIcon logo = new ImageIcon("C:\\Users\\DavidMontejanoM\\Desktop\\logo.jpg");

        JLabel label = new JLabel(logo);

        panelLogo.add(label);
        ventana.add(panelLogo);
    }
}
