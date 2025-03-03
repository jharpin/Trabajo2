package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;

public interface IProyectoCrud {
    boolean crearProyecto(String nombreProyecto, String codigoProyecto, Departamento departamentoAsociado, Empleado empleadosAsignado);

    boolean modificarProyecto(String nombreproyecto, Departamento departamentoAsociado, Empleado empleadosAsignado);

    boolean eliminarProyecto(String codigoProyecto);

}
