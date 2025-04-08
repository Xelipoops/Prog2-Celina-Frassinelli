public class Usuario {
    private int id;
    private String nombre;
    private String email;


    //metodos

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + '}';
    }

    public void crearTicket(String descripcion){
        SistemaSoporte.generarTicket(this, descripcion);
    }

}
