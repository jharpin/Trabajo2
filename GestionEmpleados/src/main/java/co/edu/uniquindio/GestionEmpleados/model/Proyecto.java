package co.edu.uniquindio.GestionEmpleados.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Proyecto {
    private static Scanner scanner = new Scanner(System.in);
    private String nombreProyecto;
    private String codigoProyecto;
    private ArrayList<Empleado>Empleados=new ArrayList();

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
    public ArrayList<Empleado> getEmpleados(){
        return Empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados){
        this.Empleados=Empleados;
    }
    private static List<Proyecto> proyectos = new ArrayList<>();

    while (true) {
        System.out.println("1. Crear Proyecto");
        System.out.println("2. Leer Proyectos");
        System.out.println("3. Actualizar Proyecto");
        System.out.println("4. Eliminar Proyecto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  

        switch (opcion) {
            case 1:
                crearProyecto();
                break;
            case 2:
                leerProyectos();
                break;
            case 3:
                actualizarProyecto();
                break;
            case 4:
                eliminarProyecto();
                break;
            case 5:
                System.out.println("Saliendo...");
                return;
            default:
                System.out.println("Opción no válida.");
        }
    }
    private static void crearProyecto() {
        System.out.print("Nombre del proyecto: ");
        String NombreProyecto = scanner.nextLine();
        System.out.print("ID del proyecto: ");
        int CodigoProyecto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Proyecto creado con éxito.");

    }
    private static void leerProyectos() {
        if (proyectos.isEmpty()) {
            System.out.println("No hay proyectos registrados.");
        } else {
            for (Proyecto proyecto : proyectos) {
                System.out.println(proyecto);
            }
        }


}}
