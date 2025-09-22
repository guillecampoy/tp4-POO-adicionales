package core;

public class Libro {
    private String titulo;
    private String autor;
    private static String editorial;

    // Constantes
    static final String EDITORIOAL_POR_DEFECTO= "Independiente";

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        cambiarEditorial(EDITORIOAL_POR_DEFECTO);
    }

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        cambiarEditorial(editorial);
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }

    public void actualizarTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public void actualizarConPrefijo(String prefijo) {
        this.titulo = prefijo+this.titulo;
    }
    public static void cambiarEditorial(String nueva) {
        Libro.editorial = nueva;
    }
}
