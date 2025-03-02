package co.edu.uniquindio.GestionEmpleados.services;

public interface IDepartamentoCrud {
    boolean crearDepartamento(String nombreDepartamento,
    String codigoDepartamento);
    boolean actualizarDepartamento(String nombreDepartamento,
    String codigoDepartamento, String codigoNuevo);
    boolean eliminarDepartamento(String codigoDepartamento);
    String obtenerDatosDepartamento(String codigoDepartamento);
    
}
