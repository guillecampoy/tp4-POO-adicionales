package features.libro;

import core.Ejecutable;
import core.Libro;
import utils.ContextColor;
import utils.UtilsColor;

public class CrearLibros implements Ejecutable {
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
    private final Libro libroIndependiente = new Libro(nombreLibroIndependiente, autorLibroIndependiente);
    private final Libro segundoLibroIndependiente = new Libro(nombreLibroIndependienteB, autorLibroIndependienteB);
    private final Libro completo = new Libro(nombreTituloCompleto, autorTituloCompleto, editorialLibroCompleto);
    private final Libro otroCompleto = new Libro(nombreOtroLibroCompleto, autorOtroLibroCompleto, editorialOtroLibroCompleto);

    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Libros creados...");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "\nLibro título + autor "+libroIndependiente);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Segundo título + autor "+segundoLibroIndependiente);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Titulo + autor + editorial "+completo);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Segundo título + autor + editorial "+otroCompleto);
    }

    public  Libro getLibroIndependiente() {
        return libroIndependiente;
    }
    public  Libro getSegundoLibroIndependiente() {
        return segundoLibroIndependiente;
    }
    public Libro getCompleto() {
        return completo;
    }
    public Libro getOtroCompleto() {
        return otroCompleto;
    }
}
