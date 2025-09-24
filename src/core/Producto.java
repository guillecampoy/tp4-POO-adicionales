package core;

import utils.ContextColor;
import utils.UtilsColor;
import utils.UtilsMoneda;

public class Producto {
    private final double BASE_PRICE = 100.00;
    private static final double IVA_BASE = 0.21;

    private String nombre;
    private double precioBase;
    private static double IVA =IVA_BASE;

    public static void setIVA(double IVA) {
        Producto.IVA = IVA;
    }
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precioBase = BASE_PRICE;
    }

    public void aplicarDescuento(double porcentajeDescuento) {
        this.precioBase = this.precioBase * (1.0 - porcentajeDescuento);
        this.precioBase = UtilsMoneda.roundArs(this.precioBase);
    }

    public void aplicarDescuento(double porcentajeDescuento, double precioMinimo) {
        double precioConDescuento = this.precioBase * (1.0 - porcentajeDescuento);
        if (precioConDescuento >= precioMinimo) {
            this.precioBase = UtilsMoneda.roundArs(precioConDescuento);
        } else {
            UtilsColor.imprimirBloque(
                    ContextColor.WARNING,
                    "No se aplica descuento: el precio con descuento quedaría por debajo del mínimo"
            );
        }
    }

    public double calcularPrecioFinal() {
        return this.precioBase += this.precioBase*IVA;
    }

    // método soporte para formateo de moneda
    public String getPrecioBaseFormated() {
        return UtilsMoneda.formatARS(precioBase);
    }

    public String getPrecioFinalFormated() {
        return UtilsMoneda.formatARS(calcularPrecioFinal());
    }

    public String getIVADecorado() {
        return UtilsMoneda.getDecoradoIVA(IVA);
    }

    @Override
    public String toString() {
        return "Producto{"
                + "nombre=" + nombre
                + ", precioBase=" + getPrecioBaseFormated()
                + ", IVA=" + getIVADecorado()
                + ", Precio Final=" + this.getPrecioFinalFormated()
                + '}';
    }
}
