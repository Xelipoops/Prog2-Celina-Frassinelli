import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        //inicializacion de variables y objetos
        Estudiante estudiante = new Estudiante("Juan" , "Perez", "5° 2°", 5.60);
        double puntos;
        boolean bucle = true;

        //desarrollo
        estudiante.mostrarInfo();

        while(bucle) {
            System.out.println("\nDesea subir o bajar la nota del estudiante? \n 1.Subir \n 2.Bajar \n 3.Terminar operación");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nCuántos puntos desea subir la nota?\n(Escribir decimales con coma.)");
                    puntos = sc.nextDouble();
                    estudiante.subirCalificacion(puntos);
                    break;

                case 2:
                    System.out.println("\nCuántos puntos desea bajar la nota?\n(Escribir decimales con coma.)");
                    puntos = sc.nextDouble();
                    estudiante.bajarCalificacion(puntos);
                    break;

                case 3:
                    bucle = false;
                    break;

                default:
                    System.out.println("\nPor favor ingrese un número válido. ");

            }
        }


    }
}
