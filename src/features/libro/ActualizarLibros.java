package features.libro;

import core.Ejecutable;
import core.Libro;
import utils.ContextColor;
import utils.UtilsColor;

public class ActualizarLibros implements Ejecutable {
    @Override
    public void execute() {
        // Creación de libros de prueba
        String tituloLibro = "Cuentos de amor, de locura y de muerte";
        String autorLibro = "Horacio Quiroga";
        String nuevoTituloPrefijo = "Edición ilustrada 2025";
        String tituloLibroB = "El principito";
        String autorLibroB = "Saint-Exupéry";
        String nuevoTituloB = "Le Petit Prince (El Principito)";
        Libro libroPrueba = new Libro(tituloLibro, autorLibro);
        Libro libroPruebaB = new Libro(tituloLibroB, autorLibroB);

        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Libros de prueba creados..");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, libroPrueba.toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, libroPruebaB.toString());

        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Actualizaciones de títulos");
        //Primer Libro
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nPrimer Libro, estrrategia prefijo");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Nombre actual libro: "+libroPrueba.getTitulo());
        //Actualizo
        libroPrueba.actualizarConPrefijo(nuevoTituloPrefijo);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo título: "+libroPrueba.getTitulo());

        //SegundoLibro
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nSegundo Libro, estrrategia nuevo título");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Nombre actual libro: "+libroPruebaB.getTitulo());
        //Actualizo
        libroPruebaB.actualizarTitulo(nuevoTituloB);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo título: "+libroPruebaB.getTitulo());
    }
}
