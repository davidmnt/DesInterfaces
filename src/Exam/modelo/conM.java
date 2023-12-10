package Exam.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conM {
    public static  Connection conn;
    public static void main() throws SQLException {

         conn = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/Desarrollo","root","admin");

        if (conn != null) {
            System.out.println("Conexión exitosa a MySQL");
            // Puedes realizar operaciones con la base de datos aquí
        } else {
            System.out.println("No se pudo conectar a MySQL");
        }
    }


    public void introducirPene(String nombre,String pass) throws SQLException {
        if (conn != null) {
            String query = "Insert into USUARIOS values(?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, pass);
            ps.executeUpdate();
        }else {
            System.out.println("Conexion nula");
        }
    }



}
