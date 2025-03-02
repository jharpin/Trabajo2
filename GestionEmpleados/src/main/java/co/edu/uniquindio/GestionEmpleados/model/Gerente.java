package co.edu.uniquindio.GestionEmpleados.model;
public class Gerente extends Empleado {
    private Departamento departamentoAsociado;
    public Gerente(String nombre,
                   String id,
                   Proyecto proyectoAsociado,
                   Departamento departamentoAsociado) {
        super(nombre, id,proyectoAsociado);
        this.departamentoAsociado = departamentoAsociado;
    }
    public Departamento getDepartamentoAsociado() {
        return departamentoAsociado;
    }
    public void setDepartamentoAsociado(Departamento departamentoAsociado) {
        this.departamentoAsociado = departamentoAsociado;
    }
}


