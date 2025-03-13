package co.edu.uniquindio.GestionEmpleados.services;

public interface ImodelFactoryServices extends IEmpleadoCrud,
        IDepartamentoCrud,IGerenteCrud,ITecnicoCrud,IProyectoCrud {
    void mostrarInfoEmpresa();

    boolean agregarProyectoAsociadaGerente(String id);

    boolean listarGerentesYProyectos();

    boolean tecnicoPerteneceProyecto();

    boolean buscarPropietarioVocales();

    boolean mostrarListaEmpleados();
}
