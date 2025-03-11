package co.edu.uniquindio.GestionEmpleados;
import co.edu.uniquindio.GestionEmpleados.factory.ModelFactory;
import co.edu.uniquindio.GestionEmpleados.model.*;
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudEmpleado(modelFactory);
        mostrarEmpleado3vocales(modelFactory);
        modelFactory.mostrarInfoEmpresa();
        mostrarListaEmpleados(modelFactory);
    }
    private static void crudEmpleado(ModelFactory modelFactory) {
        crearEmpleado(modelFactory);
        eliminarEmpleado(modelFactory);
        actualizarEmpleado(modelFactory);
        obtenerEmpleado(modelFactory);

    }
    private static void crearEmpleado(ModelFactory modelFactory) {
        modelFactory.crearEmpleado("pepe","mnb",null);
    }
    private static void eliminarEmpleado(ModelFactory modelFactory) {
        modelFactory.eliminarEmpleado("1011");
    }
    private static void actualizarEmpleado(ModelFactory modelFactory) {
        modelFactory.ActualizarEmpleado("mnb","vega",null);
    }
    private static void obtenerEmpleado(ModelFactory modelFactory) {
        Empleado empleado = modelFactory.obtenerEmpleado("mnb"); // Captura el empleado obtenido

        if (empleado != null) {
            System.out.println("Empleado encontrado: " + empleado);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
    private static void mostrarEmpleado3vocales(ModelFactory modelFactory) {
        modelFactory.buscarPropietarioVocales();
    }
    private static void mostrarListaEmpleados(ModelFactory modelFactory) {
        modelFactory.mostrarListaEmpleados();
    }
    }




