package features.cuenta;

import core.Cuenta;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.List;

public class ConsultaSaldos implements Ejecutable {
    // Creamos un set base de cuentas
    private final CreacionCuentas creacionCuentas = new CreacionCuentas();
    private final List<Cuenta> cuentas = creacionCuentas.getCuentaList();

    private final double VALOR_ARS_USDS = 1450.00;

    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Listado de cuentas");
        cuentas.forEach(producto ->
                UtilsColor.imprimirBloque(ContextColor.DEFAULT, producto.toString()));
        UtilsColor.imprimirBloque(ContextColor.WARNING,"Operaciones de consulta en Pesos");
        cuentas.forEach(cuenta -> {
            UtilsColor.imprimirBloque(ContextColor.INFO, cuenta.getSaldoFormated());
        });
        UtilsColor.imprimirBloque(ContextColor.WARNING, "Operaciones de consulta en USDs ( cotización: "+VALOR_ARS_USDS+" )");
        cuentas.forEach(cuenta -> {
            UtilsColor.imprimirBloque(ContextColor.INFO, cuenta.getSaldoFormated(VALOR_ARS_USDS));
        });
    }
}
