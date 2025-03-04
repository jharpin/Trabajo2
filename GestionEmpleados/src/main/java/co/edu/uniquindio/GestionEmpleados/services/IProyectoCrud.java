package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public interface IProyectoCrud {
    boolean crearProyecto(String nombreProyecto, String codigoProyecto, Departamento departamentoAsociado, Empleado empleadosAsignado);

    boolean modificarProyecto( String nombreProyecto,String codigoProyecto,Empleado listaEmpleados,Departamento listaDepartamento);

    boolean eliminarProyecto(String codigoProyecto);

    Proyecto obtenerProyecto(String codigoProyecto);

}
