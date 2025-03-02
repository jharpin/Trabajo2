package co.edu.uniquindio.GestionEmpleados.model;
public class Empleado {
    String nombreEmpleado;
    String idempleado;
    private String rolEspecifico;
    public Empleado (String nombreEmpleado, String idempleado, String rolEspecifico) {
        this.nombreEmpleado = nombreEmpleado;
        this.idempleado = idempleado;
        this.rolEspecifico = rolEspecifico;
    }
}
