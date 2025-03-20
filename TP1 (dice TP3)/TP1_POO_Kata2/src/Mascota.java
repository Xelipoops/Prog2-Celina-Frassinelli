public class Mascota {
    //atributos:
    String nombre;
    String especie;
    int edad;


    //constructor

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    //métodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);

    }
    public void cumplirAnios(){
        this.edad = this.edad + 1;
        System.out.println("Ahora " + this.nombre + " tiene " + this.edad + " años.");
    }
}
