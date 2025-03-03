package co.edu.uniquindio.GestionEmpleados;

import co.edu.uniquindio.GestionEmpleados.factory.ModelFactory;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;
import co.edu.uniquindio.GestionEmpleados.services.ImodelFactoryServices;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        modelFactory.crearProyecto("software desing ","y878",null,null);
        modelFactory.mostrarInfoEmpresa();
        modelFactory.eliminarEmpleado("1011");
        modelFactory.crearEmpleado("vega2","450",null);
        modelFactory.eliminarProyecto("3746");
        modelFactory.modificarProyecto("y878");
        modelFactory.mostrarInfoEmpresa();
    }


}
