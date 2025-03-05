package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public interface ImodelFactoryServices extends IEmpleadoCrud, IDepartamentoCrud {
    void mostrarInfoEmpresa();

    boolean agregarProyectoAsociadaGerente(String id);

    boolean listarGerentesYProyectos();

    boolean tecnicoPerteneceProyecto();
}
