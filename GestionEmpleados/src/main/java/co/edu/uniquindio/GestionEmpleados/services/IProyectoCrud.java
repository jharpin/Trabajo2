package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;

public interface IProyectoCrud {
    boolean crearProyecto(String nombreProyecto, String codigoProyecto, Departamento departamentoAsociado, Empleado empleadosAsignado);

    boolean modificarProyecto( String codigoProyecto);

    boolean eliminarProyecto(String codigoProyecto);

}
