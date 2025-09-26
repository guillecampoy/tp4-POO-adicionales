package features.cuenta;

import core.Cuenta;
import core.Ejecutable;
import utils.ContextColor;
import utils.UtilsColor;

import java.awt.*;
import java.util.List;

public class DepositoAndExtraccion implements Ejecutable {
    // Creamos un set base de cuentas
    private final CreacionCuentas creacionCuentas = new CreacionCuentas();
    private final List<Cuenta> cuentas = creacionCuentas.getCuentaList();

    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Cuentas creadas");
        cuentas.forEach(producto ->
                UtilsColor.imprimirBloque(ContextColor.DEFAULT, producto.toString()));
        UtilsColor.imprimirBloque(ContextColor.INFO, "Casos de depósitos");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"Caso fallido, agregar valor negativo (-12.00)");
        cuentas.getFirst().depositar(-12.00);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"Caso éxito, agrego en cuenta, cuenta con balance 0.00 (2000)");
        cuentas.get(3).depositar(2000);
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nCasos de extracciones");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"Caso fallido, intentar extraer sin saldo suficiente (20.000.000)");
        cuentas.get(2).extraer(20000000.00);
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"Caso éxito, extraigo valor (1000.00)");
        cuentas.get(1).extraer(1000);


    }
}
