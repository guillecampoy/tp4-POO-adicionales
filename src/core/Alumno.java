package core;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Alumno {
    private String nombre;
    private double promedio;

    //Constantes
    private static double NOTA_APROBACION = 6.00;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.promedio = 0;
    }
    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void actualizarPromedio (double promedio) {
        this.promedio = promedio;
    }

    public void actualizarPromedio (double [] notas) {
        if (notas == null || notas.length == 0 ) {
            // no hay nada que hacer en este caso
            return;
        }
        double suma = 0;
        for (double nota : notas) {
            suma +=nota;
        }
        this.promedio = suma / notas.length;
    }

    public boolean aprobo() {
        return promedio >= NOTA_APROBACION;
    }

    public void cambioNotaAprobacion(double nuevaNotaAprobacion) {
        NOTA_APROBACION = nuevaNotaAprobacion;
    }

    @Override
    public String toString() {
        Locale ar = Locale.of("es", "AR");
        NumberFormat nf = NumberFormat.getNumberInstance(ar);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        nf.setGroupingUsed(true);
        return "Alumno{nombre=" + nombre + ", promedio=" + nf.format(promedio) + ", aprobó="+aprobo()+'}';
    }

}
