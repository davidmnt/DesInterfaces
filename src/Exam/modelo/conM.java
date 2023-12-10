package Exam.modelo;

import java.sql.*;

public class conM {
    public static  Connection conn ;
    public static void main() throws SQLException {

         conn = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/Desarrollo","root","");

        if (conn != null) {
            System.out.println("Conexión exitosa a MySQL");
            // Puedes realizar operaciones con la base de datos aquí
        } else {
            System.out.println("No se pudo conectar a MySQL");
        }
    }


    public void introducirPene(int id,String nombre,String pass) throws SQLException {

            String query = "INSERT INTO usuarios VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2, nombre);
            ps.setString(3, pass);
            ps.executeUpdate();



    }



}
