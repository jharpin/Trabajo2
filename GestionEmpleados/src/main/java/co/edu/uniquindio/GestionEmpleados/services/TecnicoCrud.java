package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;
import co.edu.uniquindio.GestionEmpleados.model.Tecnico;
public interface TecnicoCrud {
    boolean crearTecnico(String nombre, String id, Proyecto proyectoAsociado, 
    Departamento departamentoAsociado, String especialidad);
    boolean actualizarTecnico(String id, String nuevoNombre, 
    Proyecto nuevoProyectoAsociado, Departamento nuevoDepartamentoAsociado, String nuevaEspecialidad);
    boolean eliminarTecnico(String id);
    Tecnico obtenerTecnico(String id);
}
