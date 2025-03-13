package co.edu.uniquindio.GestionEmpleados.services;
import co.edu.uniquindio.GestionEmpleados.model.*;

public interface IEmpleadoCrud {
   boolean crearEmpleado(EmpleadoBuilder NuevoEmpleado);
   boolean eliminarEmpleado(String id);
   boolean ActualizarEmpleado(String id, String nombre, Proyecto proyectoAsociado);
   Empleado obtenerEmpleado(String id);
}
