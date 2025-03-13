package co.edu.uniquindio.GestionEmpleados.model;

public  class EmpleadoBuilder {
    private String nombre;
    private String id;
    private Proyecto proyectoAsociado;

    public EmpleadoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpleadoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public EmpleadoBuilder setProyecto(Proyecto proyecto) {
        this.proyectoAsociado = proyecto;
        return this;
    }

    // 🔹 Método `build()` que usa el constructor privado de Empleado
    public Empleado build() {
        return new Empleado(nombre, id, proyectoAsociado);
    }
}