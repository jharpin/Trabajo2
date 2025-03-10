package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public interface ImodelFactoryServices extends IEmpleadoCrud,
        IDepartamentoCrud,IGerenteCrud,ITecnicoCrud,IProyectoCrud {
    void mostrarInfoEmpresa();

    boolean agregarProyectoAsociadaGerente(String id);

    boolean listarGerentesYProyectos();

    boolean tecnicoPerteneceProyecto();
}
