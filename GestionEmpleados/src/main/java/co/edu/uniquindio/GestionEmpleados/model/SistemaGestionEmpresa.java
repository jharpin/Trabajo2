package co.edu.uniquindio.GestionEmpleados.model;
import co.edu.uniquindio.GestionEmpleados.services.*;

import java.util.ArrayList;
public class SistemaGestionEmpresa implements IEmpleadoCrud, ImodelFactoryServices,IProyectoCrud,IGerenteCrud, ITecnicoCrud,IDepartamentoCrud{
    private ArrayList<Empleado> Empleados;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Gerente> gerentes;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Proyecto> proyectos;

    public SistemaGestionEmpresa() {
        /// inicializacion de listas
        this.Empleados = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
        this.gerentes = new ArrayList<>();
        this.departamentos = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    /// getters and setters
    public ArrayList<Empleado> getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.Empleados = empleados;
    }

    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    /// CRUD EMPLEADO
    @Override
    public boolean crearEmpleado(String nombre, String id, Proyecto proyectoAsociado) {
        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.setNombre(nombre);
        nuevoEmpleado.setId(id);
        nuevoEmpleado.setProyectoAsociado(proyectoAsociado);
        if (Empleados == null) {
            Empleados = new ArrayList<>();
        }
        Empleados.add(nuevoEmpleado);
        return true;
    }

    @Override
    public boolean eliminarEmpleado(String id) {
        //  Verificar que la lista no sea null
        if (Empleados == null || Empleados.isEmpty()) {
            System.out.println(" No hay empleados registrados.");
            return false;
        }

        //  Buscar el empleado por ID
        for (Empleado empleado : Empleados) {
            if (empleado.getId().equals(id)) {
                Empleados.remove(empleado);
                System.out.println(" Empleado con ID " + id + " eliminado correctamente.");
                return true;
            }
        }

        System.out.println(" No se encontró un empleado con ID " + id);
        return false;
    }

    /// CRUD Proyecto
    public boolean crearProyecto(String nombreProyecto, String codigoProyecto, Departamento departamentoAsociado, Empleado empleadosAsignado) {
        Proyecto nuevoProyecto = new Proyecto();
        nuevoProyecto.setNombreProyecto(nombreProyecto);
        nuevoProyecto.setCodigoProyecto(codigoProyecto);
        nuevoProyecto.setListaDepartamentos();
        nuevoProyecto.setListaEmpleadosAsignados();
        if (proyectos == null) {
            proyectos = new ArrayList<>();
        }
        proyectos.add(nuevoProyecto);
        return true;
    }
    @Override
    public boolean modificarProyecto(String codigoProyecto) {
        if (proyectos == null || proyectos.isEmpty()) {
            System.out.println(" No hay proyectos registrados.");
            return false;
        }
        //  Buscar el empleado por ID
        for (Proyecto proyecto : proyectos) {

            if (proyecto.getCodigoProyecto().equals(codigoProyecto)) {
                // Cambiar el nombre del proyecto
                String nombre1 = "refuerzo";
                proyecto.setNombreProyecto(nombre1);
                System.out.println("Nombre del proyecto con ID " + codigoProyecto + " cambiado a: " + nombre1);
                return true;
            }
        }
        System.out.println(" No se encontró un proyecto con ID " + codigoProyecto);
        return false;
    }
    @Override
    public boolean eliminarProyecto(String codigoProyecto) {
        //  Verificar que la lista no sea null
        if (proyectos == null || proyectos.isEmpty()) {
            System.out.println(" No hay proyectos registrados.");
            return false;
        }
        //  Buscar el empleado por ID
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getCodigoProyecto().equals(codigoProyecto)) {
                proyectos.remove(proyecto); //  Eliminar de la lista
                System.out.println(" Proyecto con ID " + codigoProyecto + " eliminado correctamente.");
                return true;
            }
        }
        System.out.println(" No se encontró un proyecto con ID " + codigoProyecto);
        return false;
    }
    ///  asociacion gerente proyecto
    @Override
    public boolean agregarProyectoAsociadaGerente(String id) {
        Proyecto proyectoAsociado = new Proyecto("manzana", "abc");
        for (Gerente gerente : getGerentes()) {
            if (gerente.getId().equals(id)) {
                gerente.setProyectoAsociado(proyectoAsociado);
            }
        }
        return false;
    }
    /// CRUD Gerente
    @Override
    public boolean crearGerente(String nombre, String id, Proyecto proyectoAsociado, Departamento departamentoAsociado) {
        Gerente gerenteExistente = obtenerGerente(id);
        if (gerenteExistente == null) {
            Gerente gerente = new Gerente(nombre, id, proyectoAsociado, departamentoAsociado);
            gerentes.add(gerente);
            return true;
        }
        return false;
    }
    @Override
    public boolean actualizarGerente(String nombre, String id, Proyecto proyectoAsociado, Departamento departamentoAsociado) {
        Gerente gerente = obtenerGerente(id);
        if (gerente != null) {
            gerente.setId(id);
            gerente.setNombre(nombre);
            gerente.setProyectoAsociado(proyectoAsociado);
            gerente.setDepartamentoAsociado(departamentoAsociado);
            return true;
        }
        return false;
    }
    @Override
    public boolean eliminarGerente(String id) {
        return gerentes.removeIf(gerente -> gerente.getId().equals(id));
    }
    @Override
    public Gerente obtenerGerente(String id) {
        for (Gerente gerente : gerentes) {
            if (gerente.getId().equals(id)) {
                return gerente;
            }
        }
        return null;
    }
    @Override
    public boolean crearTecnico(String nombre, String id, Proyecto proyectoAsociado, Departamento departamentoAsociado, String especialidad) {
        Tecnico tecnicoExistente = obtenerTecnico(id);
        if (tecnicoExistente == null) {
            Tecnico tecnico = new Tecnico(nombre, id, proyectoAsociado, departamentoAsociado, especialidad);
            tecnicos.add(tecnico);
            return true;
        }
        return false;
    }
    @Override
    public boolean actualizarTecnico(String nombre, String id, Proyecto proyectoAsociado, Departamento departamentoAsociado, String especialidad) {
        Tecnico tecnico = obtenerTecnico(id);
        if (tecnico != null) {
            tecnico.setId(id);
            tecnico.setNombre(nombre);
            tecnico.setProyectoAsociado(proyectoAsociado);
            tecnico.setDepartamentoAsociado(departamentoAsociado);
            tecnico.setEspecialidad(especialidad);
            return true;
        }
        return false;
    }
    @Override
    public boolean eliminarTecnico(String id) {
        return tecnicos.removeIf(tecnico -> tecnico.getId().equals(id));
    }
    @Override
    public Tecnico obtenerTecnico(String id) {
        for (Tecnico tecnico : tecnicos) {
            if (tecnico.getId().equals(id)) {
                return tecnico;
            }
        }
        return null;
    }
    @Override
    public boolean crearDepartamento(String nombreDepartamento, String codigoDepartamento, Gerente gerenteAsociado, Proyecto proyectoAsociado, Tecnico listaTecnico) {
        Departamento nuevoDepartamento = new Departamento();
        nuevoDepartamento.setNombreDepartamento(nombreDepartamento);
        nuevoDepartamento.setCodigoDepartamento(codigoDepartamento);
        nuevoDepartamento.setProyectoAsociado(proyectoAsociado);
        nuevoDepartamento.setGerenteAsociado(gerenteAsociado);
        nuevoDepartamento.setListaTecnicos(listaTecnico);
        nuevoDepartamento.setProyectoAsociado(proyectoAsociado);
        ///nuevoDepartamento.setGerenteAsociado();
        if (departamentos== null) {
            departamentos = new ArrayList<>();
        }
        departamentos.add(nuevoDepartamento);
        return true;
    }
    @Override
    public boolean actualizarDepartamento(String nombreDepartamento, String codigoDepartamento, String codigoNuevo) {
        if (departamentos == null || departamentos.isEmpty()) {
            System.out.println(" No hay departamentos registrados.");
            return false;
        }
        //  Buscar el departamento por ID
        for (Departamento departamento : getDepartamentos()) {

            if (departamento.getCodigoDepartamento().equals(codigoDepartamento)) {
                // Cambiar el nombre del departamento
                String nuevonombreDepartamento= "Contaduria";
                departamento.setNombreDepartamento(nuevonombreDepartamento);
                System.out.println("Nombre del Departamento  con ID " + codigoDepartamento + " cambiado a: " + nuevonombreDepartamento);
                return true;
            }
        }
        System.out.println(" No se encontró un Departamento con ID " + codigoDepartamento);
        return false;
    }
    @Override
    public boolean eliminarDepartamento(String codigoDepartamento) {
        //  Verificar que la lista no sea null
        if (departamentos == null || departamentos.isEmpty()) {
            System.out.println(" No hay departamentos registrados.");
            return false;
        }
        //  Buscar el empleado por ID
        for (Departamento departamento : departamentos) {
            if (departamento.getCodigoDepartamento().equals(codigoDepartamento)) {
                departamentos.remove(departamento); //  Eliminar de la lista
                System.out.println(" Departamento con ID " + codigoDepartamento + " eliminado correctamente.");
                return true;
            }
        }
        System.out.println(" No se encontró un Departamento con ID " + codigoDepartamento);
        return false;}

    /// Mostrar informacion empresa
    @Override
    public void mostrarInfoEmpresa() {
        System.out.println("\n--- Información de la Empresa ---");
        //mostrar proyectos
        System.out.println("\n Proyectos: ");
        for (Proyecto proyecto : getProyectos()) {
            System.out.println("    Nombre: " + proyecto.getNombreProyecto() +
                    ", codigo " + proyecto.getCodigoProyecto());
        }

        //  Mostrar empleados
        System.out.println("\n Empleados:");
        for (Empleado empleado : getEmpleados()) {
            System.out.println("   - Nombre: " + empleado.getNombre() +
                    ", ID: " + empleado.getId() +
                    ", Proyecto: " + (empleado.getProyectoAsociado() != null ? empleado.getProyectoAsociado().getNombreProyecto() : "Sin proyecto"));
        }

        //  Mostrar técnicos
        System.out.println("\n Técnicos:");
        for (Tecnico tecnico : getTecnicos()) {
            System.out.println("   - Nombre: " + tecnico.getNombre() +
                    ", ID: " + tecnico.getId() +
                    ", Especialidad: " + tecnico.getEspecialidad() +
                    ", Proyecto: " + (tecnico.getProyectoAsociado() != null ? tecnico.getProyectoAsociado().getNombreProyecto() : "Sin proyecto"));
        }

        //  Mostrar gerentes
        System.out.println("\n Gerentes:");
        for (Gerente gerente : getGerentes()) {
            System.out.println("   - Nombre: " + gerente.getNombre() +
                    ", ID: " + gerente.getId() +
                    ", Departamento: " + (gerente.getDepartamentoAsociado() != null ? gerente.getDepartamentoAsociado().getNombreDepartamento() : "Sin departamento") +
                    ", Proyecto: " + (gerente.getProyectoAsociado() != null ? gerente.getProyectoAsociado().getNombreProyecto() : "Sin proyecto"));
        }

        //  Mostrar departamentos
        System.out.println("\n Departamentos:");
        for (Departamento departamento : getDepartamentos()) {
            System.out.println("   - Nombre: " + departamento.getNombreDepartamento() +
                    ", Código: " + departamento.getCodigoDepartamento() +
                    ", Proyecto Asociado: " + (departamento.getProyectoAsociado() != null ? departamento.getProyectoAsociado().getNombreProyecto() : "Ninguno"));
        }

    }
}


