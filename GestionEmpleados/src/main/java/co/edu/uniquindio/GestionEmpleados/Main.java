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
        modelFactory.eliminarEmpleado("1011");
        modelFactory.crearEmpleado("vega2","450",null);
        modelFactory.eliminarProyecto("3746");
        modelFactory.modificarProyecto("y878");
        /// se inicializa crud Gerente
        modelFactory.crearGerente("manu", "mnñ", null, null);
        modelFactory.eliminarGerente("6025");
        modelFactory.obtenerGerente("mnñ");
        modelFactory.actualizarGerente("sans","6868",null,null);
        modelFactory.agregarProyectoAsociadaGerente("mnñ");
        /// se inicializa crud tecnico
        modelFactory.crearTecnico("Franco", "456", null, null, null);
        modelFactory.actualizarTecnico("Romario", "422", null, null, "carpintero");
        modelFactory.eliminarTecnico("456");
        modelFactory.obtenerTecnico("456");
        modelFactory.mostrarInfoEmpresa();
        /// se inicializa crud departamento
        modelFactory.crearDepartamento("recursos humanos","152201","mnñ","450","y878","456");
        modelFactory.actualizarDepartamento();
        modelFactory.eliminarDepartamento("1011");
        modelFactory.agregarProyectoAsociadoDepartamento("mnñ");
    }


}
