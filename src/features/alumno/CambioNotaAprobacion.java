package features.alumno;

import core.Alumno;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

public class CambioNotaAprobacion implements Ejecutable {
    @Override
    public void execute() {
        double notaminima = 5.00;
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Promedio minimo aprobación actual: "+Alumno.getNotaMinima());
        // Listado de alumnos con promedio
        ListaAlumnos listaAlumnos = new ListaAlumnos();
        listaAlumnos.execute();

        //Sobre escribo promedios de forma conveniente para que sea mas evidente el caso
        double[] promediosActualizados = new double[] {9.00, 5.50, 5.75, 3.00};
        listaAlumnos.setPromediosMasivo(promediosActualizados);

        UtilsColor.imprimirBloque(ContextColor.INFO, "Nuevo promedio mínimo: "+notaminima);
        Alumno.actualizarNotaMinima(notaminima);
        // Listar nueva lista de alumnos con nota mínima de aprobación modificada
        listaAlumnos.listarDiscriminadoAprobados(listaAlumnos.getAlumnos());
    }
}
