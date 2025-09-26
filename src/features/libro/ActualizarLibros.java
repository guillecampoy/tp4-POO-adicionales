package features.libro;

import core.Ejecutable;
import core.Libro;
import utils.ContextColor;
import utils.UtilsColor;

public class ActualizarLibros implements Ejecutable {
    @Override
    public void execute() {
        CrearLibros librosBase = new CrearLibros();
        // Libros base utilizados
        Libro primerLibro = librosBase.getLibroIndependiente();
        Libro segundoLibro = librosBase.getSegundoLibroIndependiente();
        Libro tercerLibro = librosBase.getCompleto();
        Libro cuartoLibro = librosBase.getOtroCompleto();

        // Creación de libros de prueba
        String libroUnoPrefijo = "Edición ilustrada 2025";
        String libroDosNuevoTitulo = "Cuentos de amor, de locura, de muerte, edición infantil";
        String libroTresPrefijo = "Edición 50ª aniversario";
        String libroCuatroNuevoTitulo ="Le Petit Prince (El Principito)";


        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Libros de prueba creados..");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, primerLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, segundoLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, tercerLibro.toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, cuartoLibro.toString());

        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Actualizaciones de títulos");
        //Primer Libro
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nPrimer Libro, estrategia prefijo");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Nombre actual libro: "+primerLibro.getTitulo());
        //Actualizo
        primerLibro.actualizarConPrefijo(libroUnoPrefijo);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo título: "+primerLibro.getTitulo());

        //Segundo Libro
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nSegundo Libro, estrategia nuevo título");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Nombre actual libro: "+segundoLibro.getTitulo());
        //Actualizo
        segundoLibro.actualizarTitulo(libroDosNuevoTitulo);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo título: "+segundoLibro.getTitulo());

        //Tercer Libro
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nTercer Libro, estrategia prefijo");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Nombre actual libro: "+tercerLibro.getTitulo());
        //Actualizo
        tercerLibro.actualizarConPrefijo(libroTresPrefijo);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo título: "+tercerLibro.getTitulo());

        //Cuarto Libro
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nCuarto Libro, estrategia nuevo título");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Nombre actual libro: "+cuartoLibro.getTitulo());
        //Actualizo
        cuartoLibro.actualizarTitulo(libroCuatroNuevoTitulo);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo título: "+cuartoLibro.getTitulo());
    }
}
