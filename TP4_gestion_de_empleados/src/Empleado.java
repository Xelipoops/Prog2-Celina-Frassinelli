import java.util.Random;
public class Empleado {
    int id; //identificador unico del empleado
    String nombre;
    String puesto;
    double salario;
    static int totalEmpleados = 0;
    int numEmpleado;
    Random randomNum = new Random();

    //constructores
    public Empleado() {}

    public Empleado(String nombre, String puesto) {
        id = randomNum.nextInt(9999);
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 5000;
        totalEmpleados++;
        numEmpleado = totalEmpleados;
    }
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        numEmpleado = totalEmpleados;
    }

    //métodos
    public void actualizarSalario(int porcentaje) {
        salario = salario + salario * ((double) porcentaje /100);
    }

    public void actualizarSalario(double aumento) {
        salario = salario + aumento;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Nombre: " + nombre + ", puesto: " + puesto + ", salario: " + salario + ", Empleado número: " + numEmpleado;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
