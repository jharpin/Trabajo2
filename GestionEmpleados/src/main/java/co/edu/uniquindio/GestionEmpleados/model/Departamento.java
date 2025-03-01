package co.edu.uniquindio.GestionEmpleados.model;

public class Departamento {
    private String nombreDepartamento;
    private String codigoDepartamento;

    public Departamento(String nombreDepartamento, String codigoDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }
}
