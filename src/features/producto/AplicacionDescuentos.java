package features.producto;

import core.Ejecutable;
import core.Producto;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.List;

public class AplicacionDescuentos implements Ejecutable {
    private final CreacionProductos creacionProductos = new CreacionProductos();
    private final List<Producto> productos = creacionProductos.getProductoList();

    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Inventario base de productos");
        imprimirListadoProductos("Precios iniciales (sin descuentos aplicados)");

        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Aplicación de descuentos");
        aplicarDescuentos();

        UtilsColor.imprimirBloque(ContextColor.INFO, "\nInventario luego de aplicar descuentos");
        imprimirListadoProductos("Precios finales con IVA");
    }

    private void aplicarDescuentos() {
        aplicarDescuentoSimple(productos.get(0), 0.10, "MacBook Pro M4 - descuento del 10%");
        aplicarDescuentoSimple(productos.get(1), 0.08, "MacBook Pro M3 - descuento del 8%");
        aplicarDescuentoConMinimo(productos.get(2), 0.25, 1_100_000,
                "MacBook Pro M1 - descuento del 25% con mínimo $1.100.000");
        aplicarDescuentoConMinimo(productos.get(3), 0.10, 90,
                "MousePad - descuento del 10% con precio mínimo $90");
            aplicarDescuentoConMinimo(productos.get(4), 0.50, 90,
                    "Pila recargable AAA - descuento del 50% con precio mínimo $90");
    }

    private void aplicarDescuentoSimple(Producto producto, double porcentaje, String descripcion) {
        UtilsColor.imprimirBloque(ContextColor.INFO, "\n" + descripcion);
        String precioAntes = producto.getPrecioBaseFormated();
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,
                "Precio base antes del descuento: " + precioAntes);
        producto.aplicarDescuento(porcentaje);
        String precioDespues = producto.getPrecioBaseFormated();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS,
                "Precio base actualizado: " + precioDespues);
        UtilsColor.imprimirBloque(ContextColor.INFO,
                "Precio final con IVA: " + producto.getPrecioFinalFormated());
    }

    private void aplicarDescuentoConMinimo(Producto producto, double porcentaje, double precioMinimo,
                                           String descripcion) {
        UtilsColor.imprimirBloque(ContextColor.INFO, "\n" + descripcion);
        String precioAntes = producto.getPrecioBaseFormated();
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,
                "Precio base antes del descuento: " + precioAntes);
        producto.aplicarDescuento(porcentaje, precioMinimo);
        String precioDespues = producto.getPrecioBaseFormated();
        ContextColor colorResultado = precioDespues.equals(precioAntes)
                ? ContextColor.WARNING
                : ContextColor.SUCCESS;
        String mensajeResultado = precioDespues.equals(precioAntes)
                ? "Se mantiene el precio base: " + precioDespues
                : "Precio base actualizado: " + precioDespues;
        UtilsColor.imprimirBloque(colorResultado, mensajeResultado);
        UtilsColor.imprimirBloque(ContextColor.INFO,
                "Precio final con IVA: " + producto.getPrecioFinalFormated());
    }

    private void imprimirListadoProductos(String titulo) {
        UtilsColor.imprimirBloque(ContextColor.WARNING, titulo);
        productos.forEach(producto ->
                UtilsColor.imprimirBloque(ContextColor.DEFAULT, producto.toString()));
    }
}
