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
        sistemaGestionEmpresa= new SistemaGestionEmpresa();

        Proyecto proyecto1=new Proyecto();
        proyecto1.setNombreProyecto("matematicas");
        proyecto1.setCodigoProyecto("1039");
        Proyecto proyecto2=new Proyecto("castellano","2938");
        proyecto2.setNombreProyecto("castellano");
        proyecto2.setCodigoProyecto("2938");
        Proyecto proyecto3=new Proyecto("ingles","3746");
        proyecto3.setNombreProyecto("ingles");
        proyecto3.setCodigoProyecto("3746");
        Proyecto proyecto4=new Proyecto("calculo","6578");
        proyecto4.setNombreProyecto("calculo");
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
    
        sistemaGestionEmpresa.getDepartamentos().add(departamento1);
        sistemaGestionEmpresa.getDepartamentos().add(departamento2);
        sistemaGestionEmpresa.getDepartamentos().add(departamento3);
        sistemaGestionEmpresa.getDepartamentos().add(departamento4);
    
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Fernando");
        empleado1.setId("1011");
        empleado1.setProyectoAsociado(proyecto1);
    
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Luisa");
        empleado2.setId("5105");
        empleado2.setProyectoAsociado(proyecto2);
    
        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Alexis");
        empleado3.setId("6025");
        empleado3.setProyectoAsociado(proyecto3);
    
        Empleado empleado4 = new Empleado();
        empleado4.setNombre("Valeria");
        empleado4.setId("6868");
        empleado4.setProyectoAsociado(proyecto4);
    
        sistemaGestionEmpresa.getEmpleados().add(empleado1);
        sistemaGestionEmpresa.getEmpleados().add(empleado2);
        sistemaGestionEmpresa.getEmpleados().add(empleado3);
        sistemaGestionEmpresa.getEmpleados().add(empleado4);
        sistemaGestionEmpresa.getEmpleados().add(empleado4);

        departamento1.setProyectoAsociado(proyecto1);
        departamento2.setProyectoAsociado(proyecto2);
        departamento3.setProyectoAsociado(proyecto3);
        departamento4.setProyectoAsociado(proyecto4);

    }


    @Override
    public boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado) {
        return sistemaGestionEmpresa.crearEmpleado(nombre,id,proyectoAsociado);
    }
}
