package co.edu.uniquindio.GestionEmpleados.model;

import java.util.ArrayList;

public class Gerente extends Empleado {
    private ArrayList<Gerente>Gerente=new ArrayList();

    public Gerente(String nombreEmpleado, String idempleado, String rolEspecifico) {
        super(nombreEmpleado, idempleado, rolEspecifico);
    }

        public String nombreEmpleado() {return nombreEmpleado();}
        public void setNombreEmpleado(String nombreEmpleado) {this.nombreEmpleado=nombreEmpleado;}
        public String getidempleado(){return idempleado;}
        public void setidempleado(String idempleado){this.idempleado=idempleado;}
        public ArrayList getGerente(){return Gerente;}
        public void setGerente(ArrayList<Gerente> gerentes){this.Gerente=Gerente;
        }
    }


