package co.edu.uniquindio.GestionEmpleados.model;
import co.edu.uniquindio.GestionEmpleados.services.IDepartamentoCrud;
import co.edu.uniquindio.GestionEmpleados.services.IEmpleadoCrud;
import co.edu.uniquindio.GestionEmpleados.services.IGerenteCrud;
import java.util.ArrayList;
public class SistemaGestionEmpresa implements IEmpleadoCrud{
    private ArrayList<Empleado> Empleados;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Gerente> gerentes;    
    private ArrayList<Departamento> departamentos;
    private ArrayList<Proyecto> proyectos;

    public SistemaGestionEmpresa() {
        
        this.tecnicos = new ArrayList<>();
        this.gerentes = new ArrayList<>();
        this.departamentos = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }
    public ArrayList<Empleado>getEmpleados(){
        return Empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados){
        this.Empleados = empleados;
    }
    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }
    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }
    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }
    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }
    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }
    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado) {
        return false;
    }

}

