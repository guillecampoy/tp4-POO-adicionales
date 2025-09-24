package app;

import core.*;
import features.alumno.ActualizarPromedios;
import features.alumno.CambioNotaAprobacion;
import features.alumno.CrearAlumnos;
import features.alumno.ListaAlumnos;
import features.cuenta.ConsultaSaldos;
import features.cuenta.CreacionCuentas;
import features.cuenta.CuentasGeneradas;
import features.cuenta.DepositoAndExtraccion;
import features.libro.ActualizarLibros;
import features.libro.CambioEditorial;
import features.libro.CrearLibros;
import features.producto.AplicacionDescuentos;
import features.producto.CambioDeIVA;
import features.producto.CreacionProductos;
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
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "--------------------------------------------");
        UtilsColor.imprimirBloque(ContextColor.INFO, "Inventario de productos con IVA");
        System.out.println("8. Creación de Productos");
        System.out.println("9. Aplicación descuentos");
        System.out.println("10. Cambio de IVA global y listar precios finales");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "--------------------------------------------");
        UtilsColor.imprimirBloque(ContextColor.INFO, "Banca simple - cuentas");
        System.out.println("11. Creación de cuentas");
        System.out.println("12. Consulta de saldos");
        System.out.println("13. Pruebas de depósito y extracción");
        System.out.println("14. Consulta cuentas generadas");
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
            case 1  ->  new CrearLibros();
            case 2  ->  new ActualizarLibros();
            case 3  ->  new CambioEditorial();
            case 4  ->  new CrearAlumnos();
            case 5  ->  new ActualizarPromedios();
            case 6  ->  new ListaAlumnos();
            case 7  ->  new CambioNotaAprobacion();
            case 8  ->  new CreacionProductos();
            case 9  ->  new AplicacionDescuentos();
            case 10  -> new CambioDeIVA();
            case 11  -> new CreacionCuentas();
            case 12  -> new ConsultaSaldos();
            case 13  -> new DepositoAndExtraccion();
            case 14  -> new CuentasGeneradas();
            default -> null;
        };
    }
}