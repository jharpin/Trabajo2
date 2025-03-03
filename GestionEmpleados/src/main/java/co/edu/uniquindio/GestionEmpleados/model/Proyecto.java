package co.edu.uniquindio.GestionEmpleados.model;
import java.util.ArrayList;
public class Proyecto {
    private String nombreProyecto;
    private String codigoProyecto;
    private ArrayList<Empleado> ListaEmpleadosAsignados;
    private ArrayList<Departamento>ListaDepartamentos;
    public Proyecto() {}
    public Proyecto(String nombre, String codigo) {
        this.nombreProyecto = nombre;
        this.codigoProyecto = codigo;
        this.ListaEmpleadosAsignados = new ArrayList<>();
        this.ListaDepartamentos = new ArrayList<>();
    }
    public String getNombreProyecto() {
        return nombreProyecto;
    }
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }
    public String getCodigoProyecto() {
        return codigoProyecto;
    }
    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }
    public ArrayList<Empleado> getListaEmpleadosAsignados() {
        return ListaEmpleadosAsignados;
    }
    public void setListaEmpleadosAsignados(){
        this.ListaEmpleadosAsignados = new ArrayList<>();
    }
    public ArrayList<Departamento> getListaDepartamentos() {
        return ListaDepartamentos;
    }
    public void setListaDepartamentos(){
        this.ListaDepartamentos = new ArrayList<>();
    }
    public String toString(){
        return "proyecto= "+nombreProyecto+", codigoProyecto= "+codigoProyecto;
    }
}