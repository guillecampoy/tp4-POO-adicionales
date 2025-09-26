package features.alumno;

import core.Alumno;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

public class CrearAlumnos implements Ejecutable {
    // Variables base para la creación de alumnos
    String nombreAlumnoUno = "Benjamin Arrieta";
    String nombreAlumnoDos = "William Wallace";
    String nombreAlumnoTres = "Jaime Campos";
    String nombreAlumnoCuatro = "Roberto Gomez Bolaños";
    double promedioAlumnoUno = 6.8;
    double promedioAlumnoCuatro = 3.9;

    // Uso de ambas formas de constructores
    Alumno alumnoUno = new Alumno(nombreAlumnoUno, promedioAlumnoUno);
    Alumno alumnoDos = new Alumno(nombreAlumnoDos);
    Alumno alumnoTres = new Alumno(nombreAlumnoTres);
    Alumno alumnoCuatro = new Alumno(nombreAlumnoCuatro, promedioAlumnoCuatro);

    // Se favorece uso desde otros casos de uso del ejercicio
    // Se reutilizará la creación en los mismos u ejecutará al acción específica del caso de uso
    public Alumno getAlumnoUno() {
        return alumnoUno;
    }
    public Alumno getAlumnoDos() {
        return alumnoDos;
    }
    public Alumno getAlumnoTres() {
        return alumnoTres;
    }
    public Alumno getAlumnoCuatro() {
        return alumnoCuatro;
    }

    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Alumnos creados...");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "\nAlumno Uno: "+alumnoUno);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Alumno DOS: "+alumnoDos);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Alumno TRES: "+alumnoTres);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Alumno CUATRO: "+alumnoCuatro);
    }
}
