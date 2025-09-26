package features.libro;

import core.Ejecutable;
import core.Libro;
import utils.ContextColor;
import utils.UtilsColor;

public class CambioEditorial implements Ejecutable {
    @Override
    public void execute() {
        CrearLibros librosBase = new CrearLibros();
        String nueveEditorial = "Editorial Planeta";

        // Libros base utilizados
        Libro primerLibro = librosBase.getLibroIndependiente();
        Libro segundoLibro = librosBase.getSegundoLibroIndependiente();
        Libro tercerLibro = librosBase.getCompleto();
        Libro cuartoLibro = librosBase.getOtroCompleto();

        //Listar estado actual de los libros
        UtilsColor.imprimirBloque(ContextColor.INFO, "Estado actual de los libros");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, primerLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, segundoLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, tercerLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, cuartoLibro.toString());

        //Cambio de editorial
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "\nCambio de editorial...");
        Libro.cambiarEditorial(nueveEditorial);

        //Resultados
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nEstado actual de los libros");
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, primerLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, segundoLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, tercerLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, cuartoLibro.toString());
    }
}
