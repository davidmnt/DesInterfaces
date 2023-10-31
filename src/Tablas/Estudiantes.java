package Tablas;

public class Estudiantes {
    private int id  = 1;
    private String nif;
    private String nombre;
    private String apellidos;
    private String email;
    private String contraseña;

    public Estudiantes(){}

    public Estudiantes(String nombre, String apellidos, String email) {
        id = id;
        nif = "";
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email =email;
        contraseña = "";
        id++;
    }

    public Estudiantes(String nif, String nombre, String apellidos, String email,String contraseña) {
        id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email =email;
        this.contraseña = contraseña;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
