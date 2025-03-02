package co.edu.uniquindio.GestionEmpleados.model;
import java.util.ArrayList;
public class SistemaGestionEmpresa implements IEmpleadoCrud{
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Gerente> gerentes;    
    private ArrayList<Departamento> departamentos;
    private ArrayList<Proyecto> proyectos;
    @Override
    public boolean CrearEmpleado(Empleado empleado){
        return false;
    }
    public SistemaGestionEmpresa() {
        this.tecnicos = new ArrayList<>();
        this.gerentes = new ArrayList<>();
        this.departamentos = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }
}