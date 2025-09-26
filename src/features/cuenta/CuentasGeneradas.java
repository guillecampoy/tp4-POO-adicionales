package features.cuenta;

import core.Cuenta;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.List;

public class CuentasGeneradas implements Ejecutable {
    // Creamos un set base de cuentas
    private final CreacionCuentas creacionCuentas = new CreacionCuentas();
    private final List<Cuenta> cuentas = creacionCuentas.getCuentaList();

    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Cuentas creadas");
        cuentas.forEach(producto ->
                UtilsColor.imprimirBloque(ContextColor.DEFAULT, producto.toString()));
        Cuenta.mostrarTotalCuentas();
    }
}
