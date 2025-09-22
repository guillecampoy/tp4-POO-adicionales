package features.alumno;

import core.Alumno;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

public class ActualizarPromedios implements Ejecutable {
    @Override
    public void execute() {
        // Crear alumnos
        CrearAlumnos alumnos = new CrearAlumnos();

        // Alumnos
        Alumno primerAlumno = alumnos.getAlumnoUno();
        Alumno segundoAlumno = alumnos.getAlumnoDos();
        Alumno tercerAlumno = alumnos.getAlumnoTres();
        Alumno cuartoAlumno = alumnos.getAlumnoCuatro();

        /*
        Estrategias
        Alumnos Uno y Dos con listado de notas
        Alumnos Tres y Cuatro con promedio calculado
         */
        double [] notasPrimerAlumno = {10, 5, 6};
        double [] notasSegundoAlumno = {7, 3, 8};
        double notasTercerAlumno = 7.5;
        double notasCuartoAlumno = 3.00;

        //Listado actual y cálculos
        UtilsColor.imprimirBloque(ContextColor.INFO, "Actualización de promedios");

        // Alumno Uno
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "\nAlumno uno: "+primerAlumno);
        //Actualización promedio
        primerAlumno.actualizarPromedio(notasPrimerAlumno);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Actualización, nuevo promedio: "+primerAlumno.getPromedioFormated());

        // Alumno Dos
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "\nAlumno dos: "+segundoAlumno);
        //Actualización promedio
        segundoAlumno.actualizarPromedio(notasSegundoAlumno);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Actualización, nuevo promedio: "+segundoAlumno.getPromedioFormated());

        // Alumno Tres
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "\nAlumno tres: "+tercerAlumno);
        //Actualización promedio
        tercerAlumno.actualizarPromedio(notasTercerAlumno);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Actualización, nuevo promedio: "+tercerAlumno.getPromedioFormated());

        // Alumno Cuatro
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "\nAlumno cuatro: "+cuartoAlumno);
        //Actualización promedio
        cuartoAlumno.actualizarPromedio(notasCuartoAlumno);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Actualización, nuevo promedio: "+cuartoAlumno.getPromedioFormated());
    }
}
