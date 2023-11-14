package Tablas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public  static Connection conn = null;
    public static void main(String[] args) throws SQLException {


        conn = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/Desarrollo","root","admin");

        if (conn != null) {
            System.out.println("Conexión exitosa a MySQL");
            // Puedes realizar operaciones con la base de datos aquí
        } else {
            System.out.println("No se pudo conectar a MySQL");
        }


    }
}
