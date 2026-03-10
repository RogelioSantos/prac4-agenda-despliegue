package com.uv.agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        
        // Lee la variable de entorno, si no existe usa un valor por defecto
        String studentName = System.getenv("STUDENT_NAME");
        if (studentName == null) studentName = "Desarrollador Local";

        while (true) {
            System.out.println("\n=====");
            System.out.println("ORGANIZADOR DE TAREAS"); 
            System.out.println("[Usuario: " + studentName + "]"); 
            System.out.println("1. Agregar una nueva tarea"); 
            System.out.println("2. Listar todas las tareas"); 
            System.out.println("3. Marcar tarea como completada"); 
            System.out.println("4. Eliminar una tarea"); 
            System.out.println("5. Ejecutar auto-diagnóstico (Tests)"); 
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: "); 

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    agenda.agregarTarea(scanner.nextLine());
                    break;
                case 2:
                    agenda.listarTareas();
                    break;
                case 3:
                    System.out.print("Número de tarea a completar: ");
                    agenda.completarTarea(scanner.nextInt() - 1);
                    break;
                case 4:
                    System.out.print("Número de tarea a eliminar: ");
                    agenda.eliminarTarea(scanner.nextInt() - 1);
                    break;
                case 5:
                    System.out.println("Para ejecutar los tests, utiliza el comando 'mvn test' en tu terminal.");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}