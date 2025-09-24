package core;

import utils.ContextColor;
import utils.UtilsColor;
import utils.UtilsMoneda;

public class Cuenta {
    int numero;
    String titular;
    double saldo;
    static int ultimoNumero = 100; // Base para auto incrementar la numeración
    static int totalCuentas = 0; // Contador global de cuentas

    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.numero = ++ultimoNumero;
        totalCuentas++;
    }
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = ++ultimoNumero;
        totalCuentas++;
    }

    public double consultarSaldo() {
        return saldo;
    }
    public double consultarSaldo(double cotizacionDolar) {
        return saldo / cotizacionDolar;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            UtilsColor.imprimirBloque(ContextColor.WARNING, "saldo negativo, no se aplica depósito");
        } else {
            saldo += valor;
            UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Operación exitosa, saldo actual: "+saldo);
        }
    }

    public void extraer(double valor) {
        if (valor > saldo) {
            UtilsColor.imprimirBloque(ContextColor.WARNING, "No se cuentan con fondos suficientes para la operación");
        } else {
            saldo -= valor;
            UtilsColor.imprimirBloque(ContextColor.ERROR, "Operación exitosa, saldo actual: "+saldo);
        }
    }

    public static void mostrarTotalCuentas(){
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Cantidad de cuentas: "+totalCuentas);
    }

    // método soporte para formateo de moneda
    public String getSaldoFormated() {
        return UtilsMoneda.formatARS(saldo);
    }

    @Override
    public String toString() {
        return "Cuenta{"
            + "numero=" + numero
                + ", titular=" + titular
                + ", saldo=" + this.getSaldoFormated()
                + ", ultima_cuenta=" + ultimoNumero
                + ", total_cuentas=" + totalCuentas
                + '}';
    }
}
