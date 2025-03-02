package co.edu.uniquindio.GestionEmpleados.services;

public interface IDepartamentoCrud {
    boolean crearDepartamento(String nombre,String codigo);
    boolean actualizarDepartamento(String nombre,String codigo, String codigoNuevo);
    boolean eliminarDepartamento(String codigo);
    String obtenerDatosDepartamento(String codigo);
    
}
