public class Estudiante {
    //atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;


    //constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }


    //metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + apellido + ".  Curso: " + curso + "  Calificacion: " + calificacion);
    }
    public void subirCalificacion(double puntos) {
        this.calificacion = calificacion + puntos;
        if (this.calificacion > 10.0)
        {
            this.calificacion = 10.0;
        }
        System.out.println("La nueva calificación es de " + this.calificacion);
    }

    public void bajarCalificacion(double puntos) {
        this.calificacion = calificacion - puntos;
        if (this.calificacion < 0.0)
        {
            this.calificacion = 0.0;
        }
        System.out.println("La nueva calificación es de " + this.calificacion);
    }



}
