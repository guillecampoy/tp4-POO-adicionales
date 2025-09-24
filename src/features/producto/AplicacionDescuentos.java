package features.producto;

import core.Ejecutable;
import core.Producto;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.List;

public class AplicacionDescuentos implements Ejecutable {
    CreacionProductos productos = new CreacionProductos();
    List<Producto> listadoProductos = productos.getProductoList();

    // Construimos diferentes escenarios para aplicar descuentos
    // Se crean 5 productos por defecto, por lo que generaresmos
    private void aplicarDescuentos() {
        // x2 casos con descuento sin validar
        UtilsColor.imprimirBloque(ContextColor.INFO, listadoProductos.getFirst().toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Se intenta aplicar un 10%");
        listadoProductos.getFirst().aplicarDescuento(0.1);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo valor: "+listadoProductos.getFirst().getPrecioFinalFormated());
        UtilsColor.imprimirBloque(ContextColor.INFO, listadoProductos.get(1).toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Se intenta aplicar un 25%");
        listadoProductos.get(1).aplicarDescuento(0.25);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo valor: "+listadoProductos.get(1).getPrecioFinalFormated());

        // x3 casos con descuento y minimo, con un caso que incumpla regla de precio con descuento < minimo
        UtilsColor.imprimirBloque(ContextColor.INFO, listadoProductos.get(2).toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Se intenta aplicar un 15%, valor minimo 3000000");
        listadoProductos.get(2).aplicarDescuento(0.15,3000000);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo valor: "+listadoProductos.get(2).getPrecioFinalFormated());
        UtilsColor.imprimirBloque(ContextColor.INFO, listadoProductos.get(3).toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Se intenta aplicar un 30%, valor minimo 100");
        listadoProductos.get(3).aplicarDescuento(0.30,100);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo valor: "+listadoProductos.get(3).getPrecioFinalFormated());
        UtilsColor.imprimirBloque(ContextColor.INFO, listadoProductos.get(4).toString());
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "Se intenta aplicar un 35%, valor minimo 50");
        listadoProductos.get(4).aplicarDescuento(0.35,50);
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Nuevo valor: "+listadoProductos.get(4).getPrecioFinalFormated());

    }


    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Creación de productos en curso..\n");
        productos.listarProductos(listadoProductos);
        UtilsColor.imprimirBloque(ContextColor.INFO, "Aplicación descuentos");
        aplicarDescuentos();
    }
}
