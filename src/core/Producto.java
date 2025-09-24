package core;

import utils.UtilsMoneda;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Producto {
    private String nombre;
    private double precioBase;
    private static double IVA;

    private static final double IVA_BASE = 0.21;
    private final double BASE_PRICE = 100.00;

    public static void setIVA(double IVA) {
        Producto.IVA = IVA;
    }
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        IVA = IVA_BASE;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precioBase = BASE_PRICE;
        IVA = IVA_BASE;
    }

    public void aplicarDescuento(double porcentajeDescuento) {
        this.precioBase -= this.precioBase * porcentajeDescuento;
    }

    public void aplicarDescuento(double porcentajeDescuento, double precioMinimo) {
        if ((this.precioBase * porcentajeDescuento) > precioMinimo ) {
            this.precioBase -= this.precioBase * porcentajeDescuento;
        } else {
            System.out.println("No se guarda descuento, precio con descuento inferior a mínmo");
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
