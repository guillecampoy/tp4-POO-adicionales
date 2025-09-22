package features.alumno;

import core.Alumno;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

public class ImpresionResultados implements Ejecutable {
    // Crear alumnos
    CrearAlumnos alumnos = new CrearAlumnos();

    // Alumnos
    Alumno primerAlumno = alumnos.getAlumnoUno();
    Alumno segundoAlumno = alumnos.getAlumnoDos();
    Alumno tercerAlumno = alumnos.getAlumnoTres();
    Alumno cuartoAlumno = alumnos.getAlumnoCuatro();

    //Almaceno en un listado para ser más legible
    Alumno[] listadoAlumnos = { primerAlumno, segundoAlumno, tercerAlumno, cuartoAlumno };

    @Override
    public void execute() {
        for (Alumno alumno : listadoAlumnos) {
            if (alumno.aprobo()){
                UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Alumno APROBADO: "+alumno);
            } else {
                UtilsColor.imprimirBloque(ContextColor.ERROR, "Alumno DESAPROBADO: "+alumno);
            }
        }
    }
}
