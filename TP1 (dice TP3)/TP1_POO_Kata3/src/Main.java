public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("Harry Potter" , "J.K.Rowling" , 1990);

        System.out.println(" Titulo: " + libro.getTitulo() + ", año: " + libro.getAnioPublicacion());

        System.out.println("Intento de settear el año a 1800: \n Año publicacion:");
        libro.setAnioPublicacion(1800);
        System.out.println(libro.getAnioPublicacion());

        System.out.println("Intento de settear el año a 2001: \n Año publicacion:");
        libro.setAnioPublicacion(2001);
        System.out.println(libro.getAnioPublicacion());

    }
}
