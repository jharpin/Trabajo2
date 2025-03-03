package co.edu.uniquindio.GestionEmpleados.model;
import co.edu.uniquindio.GestionEmpleados.services.IEmpleadoCrud;

import java.util.ArrayList;
public class SistemaGestionEmpresa implements IEmpleadoCrud {
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
    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public ArrayList<Empleado> empleados;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    @Override
    public boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado) {
        return false;
    }
}   