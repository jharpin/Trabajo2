package co.edu.uniquindio.GestionEmpleados;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        while (true) {
            System.out.println("\n--- Sistema de Gestión de Empleados ---");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Listar Empleados");
            System.out.println("3. Crear Departamento");
            System.out.println("4. Listar Departamentos");
            System.out.println("5. Crear Proyecto");
            System.out.println("6. Listar Proyectos");
            System.out.println("7. Asignar Empleado a Proyecto");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea


        }
        }
    }
