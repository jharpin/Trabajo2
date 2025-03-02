package co.edu.uniquindio.GestionEmpleados.model;
public class Empleado {
    String nombre;
    String id;
    Proyecto proyectoAsociado;
    private String rolEspecifico;
    public Empleado (String nombre,
                     String id,
                     Proyecto proyectoAsociado) {
        this.nombre = nombre;
        this.id = id;
        this.proyectoAsociado = proyectoAsociado;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getIdEmpleado(){
        return id;
    }
    public void setIdEmpleado(String id){
        this.id = id;
    }
    public Proyecto getProyectoAsociado(){
        return proyectoAsociado;
    }
    public void setProyectoAsociado(Proyecto proyectoAsociado){
        this.proyectoAsociado = proyectoAsociado;
    }
}
