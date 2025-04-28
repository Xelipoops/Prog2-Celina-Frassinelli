public class EmpleadoAComision extends Empleado{
    private double salarioMinimo;
    private int cantClientesCapturados;
    private double montoPorCliente;

    //

    public EmpleadoAComision() {}

    public EmpleadoAComision(int cantClientesCapturados) {
        this.cantClientesCapturados = cantClientesCapturados;
    }

    public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo, int cantClientesCapturados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCapturados = cantClientesCapturados;
        this.montoPorCliente = montoPorCliente;
    }

    public double getSalario() {
        double salario = cantClientesCapturados * montoPorCliente;
        if (salario < salarioMinimo) {
            salario = salarioMinimo;
        }
        return salario;
    }

    public int getCantClientesCapturados() {
        return cantClientesCapturados;
    }
}
