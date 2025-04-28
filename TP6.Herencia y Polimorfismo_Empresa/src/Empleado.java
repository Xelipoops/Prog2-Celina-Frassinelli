import java.time.LocalDate;

public class Empleado {
    private String dni, nombre, apellido;
    private int anioIngreso;

    //
    public Empleado() {}
    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public double getSalario() {
        return 0;
    }
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    public int antiguedadEnAnios() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioIngreso;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", " + dni;
    }
}
