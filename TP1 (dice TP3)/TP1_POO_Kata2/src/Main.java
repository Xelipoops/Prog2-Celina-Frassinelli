public class Main {
    public static void main(String[] args) {
        //Registro de mascotas

        Mascota mascota = new Mascota("Firulais", "Perro" , 3);

        mascota.mostrarInfo();

        System.out.println("\nHoy es el cumpleaños de " + mascota.nombre + "!");

        mascota.cumplirAnios();

        System.out.println("Nueva información: ");
        mascota.mostrarInfo();

    }
}
