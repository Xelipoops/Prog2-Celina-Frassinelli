public class Libro {
    //atributos privados
    private String titulo;
    private String autor;
    private int anioPublicacion;

    //metodos publicos


    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        //validar que el año nuevo no sea menor a 1900 o mayor a 2025
        if (nuevoAnio >= 1900 && nuevoAnio <= 2025) {
            anioPublicacion = nuevoAnio;
        }


    }
}
