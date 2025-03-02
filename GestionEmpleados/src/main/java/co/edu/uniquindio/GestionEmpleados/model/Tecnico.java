package co.edu.uniquindio.GestionEmpleados.model;
import java.util.ArrayList;
public class Tecnico extends Empleado {
    private ArrayList<Tecnico>Tecnico=new ArrayList();
    public Tecnico(String nombreEmpleado, String idempleado, String rolEspecifico) {
        super(nombreEmpleado, idempleado, rolEspecifico);
    }
    public String nombreEmpleado() {return nombreEmpleado();}
    public void setNombreEmpleado(String nombreEmpleado) {this.nombreEmpleado=nombreEmpleado;}
    public String getidempleado(){
        return idempleado;
    }
    public void setidempleado(String idempleado){
        this.idempleado=idempleado;
    }
    public ArrayList getTecnicos(){
        return Tecnico;
    }
    public void setTecnicoss(ArrayList<Tecnico> tecnicos){
        this.Tecnico=Tecnico;
    }

}
