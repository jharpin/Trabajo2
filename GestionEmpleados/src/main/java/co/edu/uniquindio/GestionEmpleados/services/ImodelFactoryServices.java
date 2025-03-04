package co.edu.uniquindio.GestionEmpleados.services;

public interface ImodelFactoryServices {
    void mostrarInfoEmpresa();

    boolean agregarProyectoAsociadaGerente(String id);

    boolean listarGerentesYProyectos();

    boolean tecnicoPerteneceProyecto(String idTecnico);
}
