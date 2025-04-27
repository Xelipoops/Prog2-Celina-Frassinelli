public class Producto {
    private String id, nombre;
    private double precio;
    private int cantidad;
    CategoriaProducto categoria;

    //
    public Producto(int Cantidad) {
        this.cantidad = Cantidad;
    }

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria, Inventario inventario) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        inventario.agregarProducto(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + this.nombre +", id: " + this.id + ", precio: " + this.precio + ", cantidad: " + this.cantidad + ", categoria: " + this.categoria);
    }


}
