package co.edu.uniquindio.GestionEmpleados.services;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public interface IEmpleadoCrud {
   boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado);
   boolean eliminarEmpleado(String id);
   boolean ActualizarEmpleado(String id, String nombre, Proyecto proyectoAsociado);
   Empleado obtenerEmpleado(String id);
}
