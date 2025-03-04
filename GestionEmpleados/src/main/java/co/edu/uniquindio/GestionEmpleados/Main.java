package co.edu.uniquindio.GestionEmpleados;

import co.edu.uniquindio.GestionEmpleados.factory.ModelFactory;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;
import co.edu.uniquindio.GestionEmpleados.services.ImodelFactoryServices;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();///instancia
        modelFactory.crearProyecto("software desing ","y878",null,null);
        /// se inicializa crud proyecto
        modelFactory.mostrarInfoEmpresa();
        /// se inicializa crud empleado
        modelFactory.crearEmpleado("vega2","450",null);
        modelFactory.eliminarEmpleado("1011");
        modelFactory.ActualizarEmpleado("5105","pepito",null);

        /// se inicializa crud proyecto
        modelFactory.crearProyecto("manufactura","JKL",null,null);
        modelFactory.eliminarProyecto("1039");
        modelFactory.modificarProyecto("peliculas","6578",null,null);

        /// se inicializa crud Gerente
        modelFactory.crearGerente("manu", "mnñ", null, null);
        modelFactory.eliminarGerente("6025");
        modelFactory.actualizarGerente("sans","6868",null,null);

        ///ejercicio propio1
        modelFactory.agregarProyectoAsociadaGerente("mnñ");
        /// se inicializa crud tecnico
        modelFactory.crearTecnico("Franco", "456", null, null, null);
        modelFactory.actualizarTecnico("Romario", "6025", null, null, "carpintero");
        modelFactory.eliminarTecnico("5105");
        modelFactory.obtenerTecnico("456");

        /// se inicializa crud departamento
        modelFactory.crearDepartamento("recursos humanos","152201",null,null,null);
        modelFactory.eliminarDepartamento("6060");
        modelFactory.actualizarDepartamento("comida","2020","3030");
        modelFactory.mostrarInfoEmpresa();
        ///ejercicio propio2
        modelFactory.listarGerentesYProyectos();
    }
    }



