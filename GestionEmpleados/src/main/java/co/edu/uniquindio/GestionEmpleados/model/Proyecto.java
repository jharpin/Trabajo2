package co.edu.uniquindio.GestionEmpleados.model;
import java.util.ArrayList;

public class Proyecto {
    private String nombreProyecto;
    private String codigoProyecto;
    private ArrayList<Empleado>Empleados=new ArrayList();

    public Proyecto(String nombreProyecto, String codigoProyecto) {
        this.nombreProyecto=nombreProyecto;
        this.codigoProyecto=codigoProyecto;
    }
    public String getNombreProyecto(){
        return nombreProyecto;
    }
    public void setNombreProyecto(String nombreProyecto){
        this.nombreProyecto=nombreProyecto;
    }
    public String getCodigoProyecto(){
        return codigoProyecto;
    }
    public void setCodigoProyecto(String codigoProyecto){
        this.codigoProyecto=codigoProyecto;
    }
    public ArrayList<Empleado> getEmpleados(){
        return Empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados){
        this.Empleados=Empleados;
    }

}
