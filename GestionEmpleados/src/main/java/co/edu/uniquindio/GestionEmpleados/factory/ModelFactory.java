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
    proyecto1.setNombreProyecto("Proyecto 1");

    Empleado empleado1= new Empleado("jean","1234",proyecto1);
    Departamento departamento1=new Departamento("quindio","1",proyecto1,null);
    Gerente gerente1=new Gerente("pedro","456",proyecto1,departamento1);
    departamento1.setGerenteAsociado(gerente1);

    }


    @Override
    public boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado) {
        return sistemaGestionEmpresa.crearEmpleado(nombre,id,proyectoAsociado);
    }
}
