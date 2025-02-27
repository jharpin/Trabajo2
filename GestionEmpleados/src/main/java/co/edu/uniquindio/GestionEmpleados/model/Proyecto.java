package co.edu.uniquindio.GestionEmpleados.model;

public class Proyecto {
    private String nombreProyecto;
    private String codigoProyecto;

    public Proyecto(String nombreProyecto, String codigoProyecto) {
        this.nombreProyecto=nombreProyecto;
        this.codigoProyecto=codigoProyecto;
    }
    public String getNombreProyecto(){
        return nombreProyecto;
    }
    public void setNombreProyecto(String nombreProyecto){
        this.nombreProyecto=nombreProyecto;
    }
    public String getCodigoProyecto(){
        return codigoProyecto;
    }
    public void setCodigoProyecto(String codigoProyecto){
        this.codigoProyecto=codigoProyecto;
    }

}
