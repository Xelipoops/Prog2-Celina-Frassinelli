import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    //
    public Inventario() {}

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        System.out.println("\nLista de productos: ");
        for (Producto producto : productos) {
            System.out.println("\t" + producto.getNombre() + "\t" + producto.getCategoria());
        }
    }

    public String buscarProductoPorID(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return "\nEl producto que está buscando es " + producto.getNombre();
            }
        }
        return "\nProducto no encontrado";

    }

    public String eliminarProducto(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                productos.remove(producto);
                return "\nSe eliminó el producto " + producto.getNombre();
            }
        }
        return "\nProducto no encontrado";
    }

    public String actualizarStock(String id, int nuevaCantidad) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                producto.setCantidad(nuevaCantidad);
                return "\nCantidad de "+ producto.getNombre() +" actualizada con exito";
            }
        }
        return "\nProducto no encontrado";
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\nLista de productos de categoría: " + categoria);
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                System.out.println("\t" + producto.getNombre());
            }
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad();
        }
        return total;
    }

    public String obtenerProductoConMayorStock() {
        Producto mayorProducto = new Producto(0);
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayorProducto.getCantidad()) {
                mayorProducto = producto;
            }
        }
        return "\nEl producto con mayor Stock es " + mayorProducto.getNombre();
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\nLista de productos entre $" + min + " y $" + max);
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                System.out.println("\t" + producto.getNombre() + "\t" + producto.getPrecio());
            }
        }
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\nLista de Categorías disponibles: ");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("\t" + categoria + "\t" + categoria.getDescripcion());
        }
    }
}
