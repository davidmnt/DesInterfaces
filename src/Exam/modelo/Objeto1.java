package Exam.modelo;

public class Objeto1 {
    private String nombre;
    private String pass;
    private String dni;
    private String mail;

    public Objeto1(){
    }

    public Objeto1(String nombre, String pass, String dni, String mail) {
        this.nombre = nombre;
        this.pass = pass;
        this.dni = dni;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Objeto1{" +
                "nombre='" + nombre + '\'' +
                ", pass='" + pass + '\'' +
                ", dni='" + dni + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
