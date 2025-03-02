package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Gerente;

public interface IGerenteCrud {
    boolean addgerente(String nombreEmpleado, String idempleado, String rolEspecifico);
}
