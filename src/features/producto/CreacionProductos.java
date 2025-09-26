package features.producto;

import core.Ejecutable;
import core.Producto;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.LinkedList;
import java.util.List;

public class CreacionProductos implements Ejecutable {
    // Variables base para la creación de múltiples productos
    String productoUnoNombre = "MackBook Pro M4";
    double productoUnoPrecio = 4500000;
    String productoDosNombre = "MackBook Pro M3";
    double productoDosPrecio = 3700000;
    String productoTresNombre = "MackBook Pro M1";
    double productoTresPrecio = 1500000;
    String productoCuatroNombre = "MousePad";
    String productoCincoNombre = "Pila recargable AAA";

    Producto productoUno = new Producto(productoUnoNombre, productoUnoPrecio);
    Producto productoDos = new Producto(productoDosNombre, productoDosPrecio);
    Producto productoTres = new Producto(productoTresNombre, productoTresPrecio);
    Producto productoCuatro = new Producto(productoCuatroNombre);
    Producto productoCinco = new Producto(productoCincoNombre);

    private final List<Producto> productoList = crearListado();

    private List<Producto> crearListado() {
        List<Producto> productoList = new LinkedList<Producto>();
        productoList.add(productoUno);
        productoList.add(productoDos);
        productoList.add(productoTres);
        productoList.add(productoCuatro);
        productoList.add(productoCinco);

        return productoList;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void listarProductos (List<Producto> listadoProductos) {
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Listado de productos creados: \n");
        listadoProductos.forEach(producto -> {
            UtilsColor.imprimirBloque(ContextColor.DEFAULT, producto.toString());
        });
    }

    @Override
    public void execute() {
        crearListado();
        listarProductos(getProductoList());
    }
}
