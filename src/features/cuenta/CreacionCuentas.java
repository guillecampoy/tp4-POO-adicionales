package features.cuenta;

import core.Cuenta;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.LinkedList;
import java.util.List;

public class CreacionCuentas implements Ejecutable {
    // Variables necesarias para la creación de cuentas
    String titularCuentaUno = "Jose Flores";
    String titularCuentaDos = "Roberto Gomez bolaños";
    String titularCuentaTres = "Maria Antoñeta de las Nieves";
    String titularCuentaCuatro = "Ruperto Jurafales";
    String titularCuentaCinco = "Marco Antonio Solis";

    double saldoCuentaUno = 150000;
    double saldoCuentaDos = 3000000;
    double saldoCuentaTres = 83000;

    // Creación de objetos cuenta
    Cuenta cuentaUno = new Cuenta(titularCuentaUno, saldoCuentaUno);
    Cuenta cuentaDos = new Cuenta(titularCuentaDos, saldoCuentaDos);
    Cuenta cuentaTres = new Cuenta(titularCuentaTres, saldoCuentaTres);
    Cuenta cuentaCuatro = new Cuenta(titularCuentaCuatro);
    Cuenta cuentaCinco = new Cuenta(titularCuentaCinco);

    private final List<Cuenta> cuentaList = crearListado();

    private List<Cuenta> crearListado() {
        List<Cuenta> cuentaList = new LinkedList<Cuenta>();
        cuentaList.add(cuentaUno);
        cuentaList.add(cuentaDos);
        cuentaList.add(cuentaTres);
        cuentaList.add(cuentaCuatro);
        cuentaList.add(cuentaCinco);

        return cuentaList;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void listarCuentas (List<Cuenta> listadoCuentas) {
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Listado de cuentas creadas: \n");
        listadoCuentas.forEach(producto -> {
            UtilsColor.imprimirBloque(ContextColor.DEFAULT, producto.toString());
        });
    }

    @Override
    public void execute() {
        crearListado();
        listarCuentas(getCuentaList());
    }
}
