package co.edu.uniquindio.GestionEmpleados.services;
import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Gerente;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public interface IGerenteCrud {
    boolean crearGerente(String nombre, String id, 
    Proyecto proyectoAsociado,Departamento departamentoAsociado);
    boolean eliminarGerente(String id);
    boolean actualizarGerente(String nombre, String id, Proyecto proyectoAsociado,
     Departamento departamentoAsociado);
    Gerente obtenerGerente(String id);
}
