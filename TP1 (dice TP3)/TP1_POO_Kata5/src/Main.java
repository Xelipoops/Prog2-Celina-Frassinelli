public class Main {
    public static void main(String[] args) {

        NaveEspacial nave = new NaveEspacial("Challenger" , 50);

        nave.mostrarEstado();

        nave.avanzar(60);

        nave.recargarCombustible(40);

        nave.avanzar(60);

        nave.mostrarEstado();


    }
}
