public class NaveEspacial {
    //atributos
    String nombre;
    int combustible;

    //constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    //metodos
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("Despegando. Combustible restante: " + combustible + " unidades.");
        }
        else {
            System.out.println("Error. Combustible restante: " + combustible + " unidades. Insuficiente para despegar.");
        }

    }
    public void avanzar (int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("Avanzando. Combustible restante: " + combustible + " unidades.");
        }
        else {
            System.out.println("Error. Combustible restante: " + combustible + " unidades. Insuficiente para avanzar.");
        }
    }
    public void recargarCombustible(int cantidad) {

        if ((combustible + cantidad) <= 100) {
            combustible += cantidad;
        }
        else {
            System.out.println("Error. Intentó cargar demasiado combustible.");
        }
    }
    public void mostrarEstado() {
        System.out.println("Nave Espacial: " + nombre + ". Combustible: " + combustible + " unidades.");
    }
}
