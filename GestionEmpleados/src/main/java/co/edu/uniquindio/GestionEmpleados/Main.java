package co.edu.uniquindio.GestionEmpleados;

import co.edu.uniquindio.GestionEmpleados.factory.ModelFactory;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory=ModelFactory.getInstance();
        crudEmpleado(modelFactory);
    }

    private static void crudEmpleado(ModelFactory modelFactory) {
        crearPropietario(modelFactory);
    }
    private static void crearPropietario(ModelFactory modelFactory) {
        Empleado empleado=new Empleado("vega","12345",null);
        modelFactory.crearEmpleado(empleado);
    }

}