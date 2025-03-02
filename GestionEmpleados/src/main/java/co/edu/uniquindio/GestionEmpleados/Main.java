package co.edu.uniquindio.GestionEmpleados;
import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;
import co.edu.uniquindio.GestionEmpleados.model.SistemaGestionEmpresa;
import co.edu.uniquindio.GestionEmpleados.model.Tecnico;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SistemaGestionEmpresa empresa=new SistemaGestionEmpresa();
        Proyecto proyecto= new Proyecto("matematicas","6789");
        Departamento departamento1=new Departamento("quindio","2",proyecto,null);
        Tecnico tecnico1=new Tecnico("vega","12412",proyecto,departamento1,"354564");
        System.out.println(tecnico1.contribuir());
    }
}