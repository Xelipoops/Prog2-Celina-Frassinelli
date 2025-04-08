public class Tecnico {
    private int id;
    private String nombre;
    private String especialidad;

    //metodos
    public Tecnico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    @Override
    public String toString() {
        return "{Técnico: " + nombre + " " + especialidad + "}";
    }

    public void tecnicoTicketEnProceso(Ticket ticket) {
        ticket.ticketEnProgreso();
    }
    public void tecnicoCerrarTicket(Ticket ticket) {
        ticket.cerrarTicket();
    }
}
