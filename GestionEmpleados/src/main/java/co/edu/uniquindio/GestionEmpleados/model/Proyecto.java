package co.edu.uniquindio.GestionEmpleados.model;
import java.util.ArrayList;
import java.util.List;
public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsociado;
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsociado = new ArrayList<>();
    }
    public Proyecto(){
    }
    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsociado;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
 
}