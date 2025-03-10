package co.edu.uniquindio.GestionEmpleados;
import co.edu.uniquindio.GestionEmpleados.factory.ModelFactory;
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crearEmpleado(modelFactory);
        modelFactory.mostrarInfoEmpresa();
    }
    private static void crearEmpleado(ModelFactory modelFactory) {
        Boolean resultado=modelFactory.crearEmpleado("juan","mnb",null);

        }
    }




