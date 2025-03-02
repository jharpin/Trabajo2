package co.edu.uniquindio.GestionEmpleados.model;
import java.util.ArrayList;
import java.util.List;
public class Proyecto {
    private String nombreProyecto;
    private String codigoProyecto;
    private List<Empleado> empleadosAsociado;
    public Proyecto(String nombre, String codigo) {
        this.nombreProyecto = nombre;
        this.codigoProyecto = codigo;
        this.empleadosAsociado = new ArrayList<>();
    }
    public Proyecto(){
    }
    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsociado;
    }
    public String getNombreProyecto() {
        return nombreProyecto;
    }
    public String getCodigoProyecto() {
        return codigoProyecto;
    }
 
}