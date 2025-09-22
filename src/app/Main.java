package app;

import core.*;
import features.alumno.ActualizarPromedios;
import features.alumno.CambioNotaAprobacion;
import features.alumno.CrearAlumnos;
import features.alumno.ImpresionResultados;
import features.libro.ActualizarLibros;
import features.libro.CambioEditorial;
import features.libro.CrearLibros;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            Ejecutable ejercicio = obtenerEjercicio(opcion);
            if (ejercicio != null) {
                ejercicio.execute();
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }
            if (opcion != 0) {
                System.out.println("Presiona Enter para continuar...");
                scanner.nextLine();
            }

        }
        while (opcion != 0);
        System.out.println("Chau!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=====================================================================================");
        UtilsColor.imprimirBloque(ContextColor.WARNING, "   Trabajo Práctico 4b - Programación Orientada a Objetos - Ejercicios Adicionales");
        System.out.println("=====================================================================================");
        System.out.println("\nSeleccionae Caso de uso");
        UtilsColor.imprimirBloque(ContextColor.INFO, "Sistema de Registro de libros con editorial");
        System.out.println("1. Crear libros");
        System.out.println("2. Actualizar libros");
        System.out.println("3. Cambio de editorial");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "--------------------------------------------");
        UtilsColor.imprimirBloque(ContextColor.INFO, "Sistema de Alumnos con Nota de Aprobación");
        System.out.println("4. Creación de Alumnos");
        System.out.println("5. Actualizar promedios");
        System.out.println("6. Impresión de resultados discriminando aprobados");
        System.out.println("7. Cambio nota aprobación");
        System.out.println("\n0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion () {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static Ejecutable obtenerEjercicio(int opcion) {
        return switch (opcion) {
            case 1  -> new CrearLibros();
            case 2  -> new ActualizarLibros();
            case 3  -> new CambioEditorial();
            case 4  -> new CrearAlumnos();
            case 5  -> new ActualizarPromedios();
            case 6  -> new ImpresionResultados();
            case 7  -> new CambioNotaAprobacion();
            default -> null;
        };
    }
}