public class Main {
    public static void main(String[] args) {

        Gallina g006 = new Gallina(006 , 3 , 120);
        Gallina g007 = new Gallina(007 , 6 , 200);

        g006.mostrarEstado();
        g007.mostrarEstado();

        g006.ponerHuevo();
        g006.ponerHuevo();

        g007.ponerHuevo();

        g007.envejecer();
        g007.envejecer();

        g006.mostrarEstado();
        g007.mostrarEstado();
    }
}
