import java.util.Date;

public class Ticket {
    private static int allId;
    private int id;
    private String descripcion;
    private Date fecha;
    private String estado;
    private Usuario usuario;
    private Tecnico tecnico;

    //metodos
    public Ticket(String descripcion) {
        this.id = allId;
        allId++;
        this.descripcion = descripcion;
        this.fecha = new Date();
        this.estado = "Abierto";
    }

    public Ticket(Usuario usuario, String descripcion) {
        this.usuario = usuario;
        this.id = allId;
        allId++;
        this.descripcion = descripcion;
        this.fecha = new Date();
        this.estado = "Abierto";
    }

    public void cerrarTicket(){
        this.estado = "Cerrado";
    }
    public void ticketEnProgreso(){
        this.estado = "En progreso";
    }
    public void mostrarDetalle(){
        System.out.println("\nId: " +id + "\tDescripción: " + descripcion + "\tEstado: " + estado + "\tUsuario: "  + usuario + "\tTécnico: "  + tecnico + "\tFecha: " + fecha);
    }
    public void asignarTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }

    public void asignarUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }
}
