public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de soporte de usuarios");
        Tecnico tecnico1 = new Tecnico(1212, "Pepe" , "IT");
        Ticket ticket1 = SistemaSoporte.generarTicket("one");
        SistemaSoporte.mostrarTicket(ticket1);

        Ticket ticket2 = SistemaSoporte.generarTicket("two");
        SistemaSoporte.mostrarTicket(ticket2);
        tecnico1.tecnicoCerrarTicket(ticket2);

        Usuario usuario1 = new Usuario(1, "Juan", "gmail");
        usuario1.crearTicket("three");

        SistemaSoporte.asignarTecnico(ticket1, tecnico1);
        tecnico1.tecnicoTicketEnProceso(ticket1);
        SistemaSoporte.asignarUsuario(ticket1, usuario1);

        SistemaSoporte.mostrarListaTickets();
        SistemaSoporte.mostrarTicketsAbiertos();
        SistemaSoporte.mostrarTicketsCerrados();

    }
}
