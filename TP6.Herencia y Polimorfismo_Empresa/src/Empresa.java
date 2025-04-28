import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    //
    public Empresa() {}

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    public void mostrarSalarios() {
        System.out.println("Lista de Salarios: ");
        for (Empleado empleado : empleados) {
            System.out.println("\tEmpleado: " + empleado.nombreCompleto() + "\tSalario: $" + empleado.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        EmpleadoAComision MayorEmpleado = new EmpleadoAComision(0);

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoAComision ) {
                if (((EmpleadoAComision) empleado).getSalario() > MayorEmpleado.getSalario()) {
                    MayorEmpleado = (EmpleadoAComision) empleado;
                }
            }
        }
        return MayorEmpleado;
    }

}
