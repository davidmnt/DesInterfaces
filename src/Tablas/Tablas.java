package Tablas;

import javax.swing.table.AbstractTableModel;
import java.util.List;


public class Tablas extends AbstractTableModel {

    private enum columnas {
        Nif("Nif"),
        Name("Name"),
        apellidos("apellidos"),
        Edad("Edad"),
        Contraseña("Contraseña"),

        Email("Email");

        final String header;

        columnas(String header) {
            this.header = header;
        }
    }

    private List<Estudiantes> estudi;

    public Tablas(List<Estudiantes> estudiantes) {
        super();
        this.estudi = estudiantes;

    }

    @Override
    public int getRowCount() {
        return estudi.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.values().length;
    }
    @Override
    public String getColumnName(int column){
        return columnas.values()[column].header;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estudiantes estu = estudi.get(rowIndex);
        switch (columnas.values()[columnIndex]) {
            case Name:
                return estu.getNombre();
            case apellidos:
                return estu.getApellidos();
            case Nif:
                return estu.getNif();
            case Email:
                return estu.getEmail();
            case Contraseña:
                return estu.getContraseña();

            default:
                throw new RuntimeException("No existe la columna" + columnIndex);
        }
    }

    public void añadir(Estudiantes est){
        estudi.add(est);
    }

    public boolean actualizar(int rowIndex, Estudiantes est){
        if(rowIndex>=estudi.size()){
            return false;
        }else{
            estudi.set(rowIndex, est);
                return true;
            }
        }


    public boolean borrar(int rowIndex){
    if(rowIndex>=estudi.size()){
        return false;
    }else{
        estudi.remove(rowIndex);
            return true;
        }
    }

}

