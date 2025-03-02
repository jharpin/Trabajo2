package co.edu.uniquindio.GestionEmpleados.factory;

import co.edu.uniquindio.GestionEmpleados.model.SistemaGestionEmpresa;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;
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

    }


    @Override
    public boolean crearEmpleado(Empleado empleado) {
        return sistemaGestionEmpresa.crearEmpleado(empleado);
    }
}
