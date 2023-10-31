package Tablas;

public class Estudiantes {
    private int id  = 0;
    private String nif;
    private String nombre;
    private String apellidos;
    private int edad;

    public Estudiantes(String nif, String nombre, String apellidos, int edad) {
        id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

        id++;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }


}
