public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        EmpleadoAComision emp1 = new EmpleadoAComision("44771950", "Juan", "Perez", 2003, 200.0, 5, 50);
        EmpleadoAComision emp2 = new EmpleadoAComision("33552233", "Maria", "Gimenez", 2015, 150.0, 10, 40);
        EmpleadoSalarioFijo emp3 = new EmpleadoSalarioFijo("55882950", "Pedro", "Lopez", 2007, 250.0);
        EmpleadoSalarioFijo emp4 = new EmpleadoSalarioFijo("55883904", "Doña", "Martinez", 2012, 230.0);

        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        empresa.agregarEmpleado(emp4);

        empresa.mostrarSalarios();

        System.out.println("Empleado con más clientes: " + empresa.empleadoConMasClientes());

    }

}
