package features.alumno;

import core.Alumno;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.List;

public class ImpresionResultados implements Ejecutable {
    public List<Alumno> crearListado () {
        // Crear alumnos
        CrearAlumnos alumnos = new CrearAlumnos();

        // Alumnos
        Alumno primerAlumno = alumnos.getAlumnoUno();
        Alumno segundoAlumno = alumnos.getAlumnoDos();
        Alumno tercerAlumno = alumnos.getAlumnoTres();
        Alumno cuartoAlumno = alumnos.getAlumnoCuatro();

        return List.of(primerAlumno, segundoAlumno, tercerAlumno, cuartoAlumno);
    }


    public void listarDiscriminadoAprobados (List<Alumno> listadoAlumnos) {
        listadoAlumnos.forEach(alumno -> {
            if (alumno.aprobo()) {
                UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Alumno APROBADO: " + alumno);
            } else {
                UtilsColor.imprimirBloque(ContextColor.ERROR, "Alumno DESAPROBADO: " + alumno);
            }
        });
    }

    @Override
    public void execute() {
        List<Alumno> listadoAlumnos = crearListado();
        listarDiscriminadoAprobados(listadoAlumnos);
    }
}
