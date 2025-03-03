package co.edu.uniquindio.GestionEmpleados.services;
import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Gerente;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public interface IGerenteCrud {
    boolean creargerente(String nombre, String id, 
    Proyecto proyectoAsociado,Departamento departamentoAsociado);
    boolean actualizargerente(String nombre, String id, 
    Proyecto proyectoAsociado, Departamento departamentoAsociado,
     String idNuevo);
    boolean eliminargerente(String id);
    Gerente obtenergerente(String id);
}
