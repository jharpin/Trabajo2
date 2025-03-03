package co.edu.uniquindio.GestionEmpleados.factory;

import co.edu.uniquindio.GestionEmpleados.model.*;
import co.edu.uniquindio.GestionEmpleados.services.IEmpleadoCrud;
import co.edu.uniquindio.GestionEmpleados.services.ITecnicoCrud;
import co.edu.uniquindio.GestionEmpleados.services.ImodelFactoryServices;
import co.edu.uniquindio.GestionEmpleados.services.IDepartamentoCrud;

public class ModelFactory implements IEmpleadoCrud {
    private static ModelFactory modelFactory;
    private SistemaGestionEmpresa  sistemaGestionEmpresa;

    private ModelFactory(){
        inicializarDatos();

    }
    public static ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return  modelFactory;
    }
    private void inicializarDatos() {
        Departamento departamento1 = new Departamento();
        departamento1.setNombre("Administrativo");
        departamento1.setCodigo("2020");
    
        Departamento departamento2 = new Departamento();
        departamento2.setNombre("Recursos Humanos");
        departamento2.setCodigo("2022");
    
        Departamento departamento3 = new Departamento();
        departamento3.setNombre("Marketing");
        departamento3.setCodigo("2025");
    
        Departamento departamento4 = new Departamento();
        departamento4.setNombre("General");
        departamento4.setCodigo("6060");
    
        SistemaGestionEmpresa.getDepartamentos().add(departamento1);
        SistemaGestionEmpresa.getDepartamentos().add(departamento2);
        SistemaGestionEmpresa.getDepartamentos().add(departamento3);
        SistemaGestionEmpresa.getDepartamentos().add(departamento4);
    
        Empleado empleado = new Empleado();
        empleado.setNombre("Luis");
        empleado.setId("1010");
        empleado.setDepartamento("Administrativo");
        empleado.setEspecialidad("Gerencia");
    
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Fernando");
        empleado1.setId("1011");
        empleado1.setDepartamento("General");
        empleado1.setEspecialidad("Electricista");
    
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Luisa");
        empleado2.setId("5105");
        empleado2.setDepartamento("General");
        empleado2.setEspecialidad("Mantenimiento");
    
        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Alexis");
        empleado3.setId("6025");
        empleado3.setDepartamento("Administrativo");
        empleado3.setEspecialidad("Mantenimiento");
    
        Empleado empleado4 = new Empleado();
        empleado4.setNombre("Valeria");
        empleado4.setId("6868");
        empleado4.setDepartamento("Recursos Humanos");
        empleado4.setEspecialidad("Archivo");
    
        SistemaGestionEmpresa.getEmpleado().add(empleado1);
        SistemaGestionEmpresa.getEmpleado().add(empleado2);
        SistemaGestionEmpresa.getEmpleado().add(empleado3);
        SistemaGestionEmpresa.getEmpleado().add(empleado4);
        SistemaGestionEmpresa.getEmpleado().add(empleado4);
        departamento1.getEmpleado().add(empleado1);
        departamento2.getEmpleado().add(empleado2);
        departamento3.getEmpleado().add(empleado3);
        departamento4.getEmpleado().add(empleado4);

    }


    @Override
    public boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado) {
        return sistemaGestionEmpresa.crearEmpleado(nombre,id,proyectoAsociado);
    }
}
