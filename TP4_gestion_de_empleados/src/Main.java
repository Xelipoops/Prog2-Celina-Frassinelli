import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Maria", "computación");
        Empleado emp2 = new Empleado("Juan" , "cocina");
        Empleado emp3 = new Empleado( 2948 , "Jose" , "supervisor" , 6000.0);
        Empleado emp4 = new Empleado( 5836 , "Ana" , "limpieza", 3000.0);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);
        listaEmpleados.add(emp3);
        listaEmpleados.add(emp4);

        emp1.actualizarSalario(20);
        emp2.actualizarSalario(2000.0);

        for (Empleado emp : listaEmpleados) {
            System.out.println(emp.toString());
        }

        System.out.println("El total actual de empleados es " + Empleado.mostrarTotalEmpleados());


    }
}
