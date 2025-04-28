public class EmpleadoSalarioFijo extends Empleado {
    private static double PORC1 = 0.05, PORC2 = 0.1;
    private static int ANIO1 =2, ANIO2 =5;

    private double sueldoBasico;

    //
    public EmpleadoSalarioFijo() {}

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public double getSalario() {
        double salario = sueldoBasico;
        int antiguedad = this.antiguedadEnAnios();
        if (antiguedad < ANIO2) {
            salario = sueldoBasico + (sueldoBasico*PORC1);
        }
        if (antiguedad >= ANIO2) {
            salario = sueldoBasico + (sueldoBasico*PORC2);
        }
        return salario;
    }

}
