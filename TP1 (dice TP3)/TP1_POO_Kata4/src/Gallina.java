public class Gallina {
    public int idGallina;
    public int edad;
    public int huevosPuestos;

    //constructor

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    //metodos
    public void ponerHuevo() {
        huevosPuestos++;
    }
    public void envejecer() {
        edad++;
    }
    public void mostrarEstado() {
        System.out.println("Id gallina: " + idGallina + "\nEdad: " + edad + "\nHuevos puestos: " + huevosPuestos + "\n");
    }

}
