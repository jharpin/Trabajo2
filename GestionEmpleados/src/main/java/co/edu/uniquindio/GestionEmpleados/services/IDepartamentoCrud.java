package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Gerente;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;
import co.edu.uniquindio.GestionEmpleados.model.Tecnico;
import co.edu.uniquindio.GestionEmpleados.model.Departamento;

public interface IDepartamentoCrud {
    boolean crearDepartamento(String nombreDepartamento, String codigoDepartamento, Gerente gerenteAsociado, Proyecto proyectoAsociado, Tecnico listaTecnicos);
    boolean eliminarDepartamento(String codigoDepartamento);
    boolean actualizarDepartamento(String nombreDepartamento, String codigoDepartamento,Gerente gerenteAsociado,Proyecto proyectoAsociado,Tecnico listaTecnicos);
    Departamento ObtenerDepartamento(String codigoDepartamento);
}
