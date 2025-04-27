public class Main {
    public static void main(String[] args) {

        //Kata 1

        Inventario inventario = new Inventario();

        Producto producto1 = new Producto("1234", "Fideos" , 800.0, 5, CategoriaProducto.ALIMENTOS, inventario);
        producto1.mostrarInfo();
        Producto producto2 = new Producto("3456", "Auriculares", 2500.0, 1, CategoriaProducto.ELECTRONICA, inventario);
        producto2.mostrarInfo();
        Producto producto3 = new Producto("6789", "Remera", 3000.0, 2, CategoriaProducto.ROPA, inventario);
        producto3.mostrarInfo();
        Producto producto4 = new Producto("4567", "Cortinas", 4000.0, 3, CategoriaProducto.HOGAR, inventario);
        producto4.mostrarInfo();
        Producto producto5 = new Producto("5678", "Manzana", 500.0, 10, CategoriaProducto.ALIMENTOS, inventario);
        producto5.mostrarInfo();
        Producto producto6 = new Producto("7890", "Medias", 1500.0, 2, CategoriaProducto.ROPA, inventario);
        producto6.mostrarInfo();

        inventario.listarProductos();

        // Kata 2

        System.out.println(inventario.buscarProductoPorID("4567"));
        System.out.println(inventario.buscarProductoPorID("5278"));

        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println(inventario.eliminarProducto("1234"));
        inventario.listarProductos();

        System.out.println(inventario.actualizarStock("3456", 6));

        // Kata 3

        System.out.println("\nEl total de stock es: " + inventario.obtenerTotalStock());

        System.out.println(inventario.obtenerProductoConMayorStock());

        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);

        inventario.mostrarCategoriasDisponibles();



    }
}
