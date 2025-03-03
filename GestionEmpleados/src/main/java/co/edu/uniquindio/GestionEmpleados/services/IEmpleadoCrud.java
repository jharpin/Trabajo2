package co.edu.uniquindio.GestionEmpleados.services;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public interface IEmpleadoCrud {
   boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado);

}
