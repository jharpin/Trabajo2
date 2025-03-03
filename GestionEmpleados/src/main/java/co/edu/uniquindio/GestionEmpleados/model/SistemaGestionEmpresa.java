package co.edu.uniquindio.GestionEmpleados.model;
import co.edu.uniquindio.GestionEmpleados.services.IDepartamentoCrud;
import co.edu.uniquindio.GestionEmpleados.services.IEmpleadoCrud;
import co.edu.uniquindio.GestionEmpleados.services.IGerenteCrud;
import co.edu.uniquindio.GestionEmpleados.services.ImodelFactoryServices;

import java.util.ArrayList;
public class SistemaGestionEmpresa implements IEmpleadoCrud, ImodelFactoryServices {
    private ArrayList<Empleado> Empleados;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Gerente> gerentes;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Proyecto> proyectos;

    public SistemaGestionEmpresa() {
        this.Empleados = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
        this.gerentes = new ArrayList<>();
        this.departamentos = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
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
        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.setNombre(nombre);
        nuevoEmpleado.setId(id);
        nuevoEmpleado.setProyectoAsociado(proyectoAsociado);


        if (Empleados == null) {
            Empleados = new ArrayList<>();
        }

        Empleados.add(nuevoEmpleado);
        return true;
    }

    @Override
    public void mostrarInfoEmpresa() {
        System.out.println("\n--- Información de la Empresa ---");
        //mostrar proyectos
        System.out.println("\n Proyectos: ");
        for ( Proyecto proyecto: getProyectos()){
            System.out.println("    Nombre: "+proyecto.getNombreProyecto()+
                    ", codigo "+proyecto.getCodigoProyecto());
        }

        //  Mostrar empleados
        System.out.println("\n Empleados:");
        for (Empleado empleado : getEmpleados()) {
            System.out.println("   - Nombre: " + empleado.getNombre() +
                    ", ID: " + empleado.getId() +
                    ", Proyecto: " + (empleado.getProyectoAsociado() != null ? empleado.getProyectoAsociado().getNombreProyecto() : "Sin proyecto"));
        }

        //  Mostrar técnicos
        System.out.println("\n Técnicos:");
        for (Tecnico tecnico : getTecnicos()) {
            System.out.println("   - Nombre: " + tecnico.getNombre() +
                    ", ID: " + tecnico.getId() +
                    ", Especialidad: " + tecnico.getEspecialidad() +
                    ", Proyecto: " + (tecnico.getProyectoAsociado() != null ? tecnico.getProyectoAsociado().getNombreProyecto() : "Sin proyecto"));
        }

        //  Mostrar gerentes
        System.out.println("\n Gerentes:");
        for (Gerente gerente : getGerentes()) {
            System.out.println("   - Nombre: " + gerente.getNombre() +
                    ", ID: " + gerente.getId() +
                    ", Departamento: " + (gerente.getDepartamentoAsociado() != null ? gerente.getDepartamentoAsociado().getNombreDepartamento() : "Sin departamento") +
                    ", Proyecto: " + (gerente.getProyectoAsociado() != null ? gerente.getProyectoAsociado().getNombreProyecto() : "Sin proyecto"));
        }

        //  Mostrar departamentos
        System.out.println("\n Departamentos:");
        for (Departamento departamento :getDepartamentos()) {
            System.out.println("   - Nombre: " + departamento.getNombreDepartamento() +
                    ", Código: " + departamento.getCodigoDepartamento() +
                    ", Proyecto Asociado: " + (departamento.getProyectoAsociado() != null ? departamento.getProyectoAsociado().getNombreProyecto() : "Ninguno"));
        }

    }
}

