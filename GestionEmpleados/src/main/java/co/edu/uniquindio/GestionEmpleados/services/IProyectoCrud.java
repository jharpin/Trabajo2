package co.edu.uniquindio.GestionEmpleados.services;
import java.util.ArrayList;
import java.util.List;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;

public class Proyecto {
    private String nombreProyecto;
    private String codigoProyecto;
    private ArrayList<Empleado> empleadosAsociados;

    public Proyecto(String nombreProyecto, String codigoProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.codigoProyecto = codigoProyecto;
        this.empleadosAsociados = new ArrayList<>();
    }
    public Proyecto() {
    }
    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsociados;
    }
    public String getNombreProyecto() {
        return nombreProyecto;
    }
    public String getCodigoProyecto() {
        return codigoProyecto;
    }
}