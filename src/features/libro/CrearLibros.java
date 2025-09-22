package features.libro;

import core.Ejecutable;
import core.Libro;
import utils.ContextColor;
import utils.UtilsColor;

import java.awt.*;

public class CrearLibros implements Ejecutable {
    @Override
    public void execute() {
        // Definición variables base construcción libros
        String nombreLibroIndependiente = "Desierto de piedra";
        String nombreLibroIndependienteB = "Cuentos de amor, de locura y de muerte";
        String nombreTituloCompleto = "Martín Fierro";
        String nombreOtroLibroCompleto = "El principito";
        String autorLibroIndependiente = "Hugo Wast";
        String autorLibroIndependienteB = "Horacio Quiroga";
        String autorTituloCompleto = "José Hernández";
        String autorOtroLibroCompleto = "Saint-Exupéry";
        String editorialLibroCompleto = "Gauchesca";
        String editorialOtroLibroCompleto = "Viva la France!";

        // Uso de ambas formas de constructores
        Libro libroIndependiente = new Libro(nombreLibroIndependiente, autorLibroIndependiente);
        Libro segundoLibroIndependiente = new Libro(nombreLibroIndependienteB, autorLibroIndependienteB);
        Libro completo = new Libro(nombreTituloCompleto, autorTituloCompleto, editorialLibroCompleto);
        Libro otroCompleto = new Libro(nombreOtroLibroCompleto, autorOtroLibroCompleto, editorialOtroLibroCompleto);

        UtilsColor.imprimirBloque(ContextColor.INFO, "Libros creados...");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "\nLibro editorial independiente"+libroIndependiente);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Segundo libro editorial independiente"+segundoLibroIndependiente);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Libro + editorial"+completo);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Segundo libro + editorial"+otroCompleto);



    }
}
