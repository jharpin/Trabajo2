package co.edu.uniquindio.GestionEmpleados;

import co.edu.uniquindio.GestionEmpleados.factory.ModelFactory;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory=ModelFactory.getInstance();
        crudEmpleado(modelFactory);
    }

    private static void crudEmpleado(ModelFactory modelFactory) {
        crearEmpleado(modelFactory);
    }
    private static void crearEmpleado(ModelFactory modelFactory) {
        String nombre1 = "pepe";
        String id1 = "12345";
        Proyecto proyecto1 = null;
        modelFactory.crearEmpleado(nombre1, id1, proyecto1);

        String nombre2 = "ana";
        String id2 = "12346";
        Proyecto proyecto2 = null;
        modelFactory.crearEmpleado(nombre2, id2, proyecto2);
    }

}