package features.producto;

import core.Ejecutable;
import core.Producto;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.List;

public class CambioDeIVA implements Ejecutable {
    // Creamos un set base de productos
    private final CreacionProductos creacionProductos = new CreacionProductos();
    private final List<Producto> productos = creacionProductos.getProductoList();
    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Inventario base de productos");
        imprimirListadoProductos("Precios iniciales");

        //Modificamos IVA, se modifica a 15%
        Producto.setIVA(0.15);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Se modificó IVA al 15%");

        //Re impresión de artículos
        imprimirListadoProductos("\nPrecios con IVA actualizado");
    }

    private void imprimirListadoProductos(String titulo) {
        UtilsColor.imprimirBloque(ContextColor.WARNING, titulo);
        productos.forEach(producto ->
                UtilsColor.imprimirBloque(ContextColor.DEFAULT, producto.toString()));
    }
}
