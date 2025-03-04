package co.edu.uniquindio.GestionEmpleados.factory;

import co.edu.uniquindio.GestionEmpleados.model.*;
import co.edu.uniquindio.GestionEmpleados.services.*;

public class ModelFactory implements IEmpleadoCrud,ImodelFactoryServices, IProyectoCrud,IGerenteCrud, ITecnicoCrud{
    private static ModelFactory modelFactory;
    private SistemaGestionEmpresa  sistemaGestionEmpresa;

    private ModelFactory(){inicializarDatos();}
    public static ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return  modelFactory;
    }
    private void inicializarDatos() {
        sistemaGestionEmpresa= new SistemaGestionEmpresa();
        Proyecto proyecto1=new Proyecto();
        proyecto1.setNombreProyecto("Expansion");
        proyecto1.setCodigoProyecto("1039");
        Proyecto proyecto2=new Proyecto();
        proyecto2.setNombreProyecto("Social");
        proyecto2.setCodigoProyecto("2938");
        Proyecto proyecto3=new Proyecto();
        proyecto3.setNombreProyecto("Mercadeo");
        proyecto3.setCodigoProyecto("3746");
        Proyecto proyecto4=new Proyecto();
        proyecto4.setNombreProyecto("Construccion");
        proyecto4.setCodigoProyecto("6578");
        Departamento departamento1 = new Departamento();
        departamento1.setNombreDepartamento("Administrativo");
        departamento1.setCodigoDepartamento("2020");
        Departamento departamento2 = new Departamento();
        departamento2.setNombreDepartamento("Recursos Humanos");
        departamento2.setCodigoDepartamento("2022");
        Departamento departamento3 = new Departamento();
        departamento3.setNombreDepartamento("Marketing");
        departamento3.setCodigoDepartamento("2025");
        Departamento departamento4 = new Departamento();
        departamento4.setNombreDepartamento("General");
        departamento4.setCodigoDepartamento("6060");
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Fernando");
        empleado1.setId("1011");
        empleado1.setProyectoAsociado(proyecto1);
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("John");
        empleado2.setId("5105");
        empleado2.setProyectoAsociado(proyecto2);
        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Alexis");
        empleado3.setId("6025");
        empleado3.setProyectoAsociado(proyecto3);
        Empleado empleado4 = new Empleado();
        empleado4.setNombre("Ricardo");
        empleado4.setId("6868");
        empleado4.setProyectoAsociado(proyecto4);
        Tecnico tecnico1= new Tecnico();
        tecnico1.setNombre("Juan");
        tecnico1.setId("1011"); 
        tecnico1.setProyectoAsociado(proyecto1);
        tecnico1.setDepartamentoAsociado(departamento1);
        tecnico1.setEspecialidad("Diagnostico");
        Tecnico tecnico2= new Tecnico();   
        tecnico2.setNombre("Carlos");
        tecnico2.setId("5105");
        tecnico2.setProyectoAsociado(proyecto2);
        tecnico2.setDepartamentoAsociado(departamento2);
        tecnico2.setEspecialidad("Mantenimiento");
        Tecnico tecnico3= new Tecnico();    
        tecnico3.setNombre("Pedro");
        tecnico3.setId("6025");
        tecnico3.setProyectoAsociado(proyecto3);
        tecnico3.setDepartamentoAsociado(departamento3);
        tecnico3.setEspecialidad("Instalacion");
        Tecnico tecnico4= new Tecnico();
        tecnico4.setNombre("Mario");    
        tecnico4.setId("6868");
        tecnico4.setProyectoAsociado(proyecto4);
        tecnico4.setDepartamentoAsociado(departamento4);
        tecnico4.setEspecialidad("Electricidad");
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Marlon");
        gerente1.setId("1011");
        gerente1.setProyectoAsociado(proyecto1);
        gerente1.setDepartamentoAsociado(departamento1);
        Gerente gerente2 = new Gerente();
        gerente2.setNombre("Javier");
        gerente2.setId("5105");
        gerente2.setProyectoAsociado(proyecto2);
        gerente2.setDepartamentoAsociado(departamento2);
        Gerente gerente3 = new Gerente();
        gerente3.setNombre("Andres");
        gerente3.setId("6025");
        gerente3.setProyectoAsociado(proyecto3);
        gerente3.setDepartamentoAsociado(departamento3);
        Gerente gerente4 = new Gerente();
        gerente4.setNombre("Pablo");
        gerente4.setId("6868");
        gerente4.setProyectoAsociado(proyecto4);
        gerente4.setDepartamentoAsociado(departamento4);
        departamento1.setProyectoAsociado(proyecto1);
        departamento2.setProyectoAsociado(proyecto2);
        departamento3.setProyectoAsociado(proyecto3);
        departamento4.setProyectoAsociado(proyecto4);

        sistemaGestionEmpresa.getDepartamentos().add(departamento1);
        sistemaGestionEmpresa.getDepartamentos().add(departamento2);
        sistemaGestionEmpresa.getDepartamentos().add(departamento3);
        sistemaGestionEmpresa.getDepartamentos().add(departamento4);
        sistemaGestionEmpresa.getEmpleados().add(empleado1);
        sistemaGestionEmpresa.getEmpleados().add(empleado2);
        sistemaGestionEmpresa.getEmpleados().add(empleado3);
        sistemaGestionEmpresa.getEmpleados().add(empleado4);
        sistemaGestionEmpresa.getEmpleados().add(empleado4);
        sistemaGestionEmpresa.getTecnicos().add(tecnico1);
        sistemaGestionEmpresa.getTecnicos().add(tecnico2);
        sistemaGestionEmpresa.getTecnicos().add(tecnico3);
        sistemaGestionEmpresa.getTecnicos().add(tecnico4);
        sistemaGestionEmpresa.getGerentes().add(gerente1);
        sistemaGestionEmpresa.getGerentes().add(gerente2);
        sistemaGestionEmpresa.getGerentes().add(gerente3);
        sistemaGestionEmpresa.getGerentes().add(gerente4);
        sistemaGestionEmpresa.getProyectos().add(proyecto1);
        sistemaGestionEmpresa.getProyectos().add(proyecto2);
        sistemaGestionEmpresa.getProyectos().add(proyecto3);
        sistemaGestionEmpresa.getProyectos().add(proyecto4);
       
    }


    @Override
    public boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado) {
        return sistemaGestionEmpresa.crearEmpleado(nombre,id,proyectoAsociado);
    }

    @Override
    public boolean eliminarEmpleado(String id) {
        return sistemaGestionEmpresa.eliminarEmpleado(id);
    }

    @Override
    public void mostrarInfoEmpresa() {
        sistemaGestionEmpresa.mostrarInfoEmpresa();
    }

    @Override
    public boolean crearProyecto(String nombreProyecto, String codigoProyecto, Departamento departamentoAsociado, Empleado empleadosAsignado) {
        return sistemaGestionEmpresa.crearProyecto(nombreProyecto,codigoProyecto,departamentoAsociado,empleadosAsignado);
    }

    @Override
    public boolean modificarProyecto(String codigoProyecto) {
        return sistemaGestionEmpresa.modificarProyecto(codigoProyecto);
    }
    @Override
    public boolean eliminarProyecto(String codigoProyecto) {
        return sistemaGestionEmpresa.eliminarProyecto(codigoProyecto);
    }

    @Override
    public boolean crearGerente(String nombre, String id, Proyecto proyectoAsociado, Departamento departamentoAsociado) {
        return sistemaGestionEmpresa.crearGerente(nombre, id, proyectoAsociado, departamentoAsociado);
    }
    @Override
    public boolean actualizarGerente(String id, String nombre, Proyecto proyectoAsociado, 
                                 Departamento departamentoAsociado, String idNuevo) {
        return sistemaGestionEmpresa.actualizarGerente(id, nombre, proyectoAsociado, 
                                                   departamentoAsociado, idNuevo);
    }

    @Override
    public boolean eliminarGerente(String id) {
        return sistemaGestionEmpresa.eliminarGerente(id);
    }
    @Override
    public Gerente obtenerGerente(String id) {
        return sistemaGestionEmpresa.obtenerGerente(id);
    }

    @Override 
    public boolean crearTecnico(String nombre, String id, Proyecto proyectoAsociado, Departamento departamentoAsociado, String especialidad) {
        return sistemaGestionEmpresa.crearTecnico(nombre, id, proyectoAsociado, departamentoAsociado, especialidad);
    }

    
}
