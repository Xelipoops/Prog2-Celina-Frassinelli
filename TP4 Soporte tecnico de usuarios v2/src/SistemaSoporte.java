import java.util.ArrayList;

public class SistemaSoporte {

    //gestiona lista de tickets
    //cantidad de tickets abiertos y cerrados
    //que usuario genero cada ticket
    // que técnico resolvio cada ticket
    //asignar un técnico a un ticket
    public static ArrayList<Ticket> listaTickets = new ArrayList<>();


    //metodos
    public static Ticket generarTicket(String descripcion){
        Ticket ticket = new Ticket(descripcion);
        listaTickets.add(ticket);
        return ticket;
    }
    public static Ticket generarTicket(Usuario usuario, String descripcion) {
        Ticket ticket = new Ticket(usuario, descripcion);
        listaTickets.add(ticket);
        return ticket;
    }

    public static void mostrarTicket(Ticket ticket){
        ticket.mostrarDetalle();
    }

    public static void mostrarListaTickets(){
        System.out.println("\n");
        for(Ticket ticket : listaTickets){
            ticket.mostrarDetalle();
        }
    }

    public static void mostrarTicketsAbiertos() {
        System.out.println("\n");
        for(Ticket ticket : listaTickets){
            if (ticket.getEstado().equals("Abierto")){
                ticket.mostrarDetalle();
            }
        }
    }

    public static void mostrarTicketsCerrados() {
        System.out.println("\n");
        for(Ticket ticket : listaTickets){
            if (ticket.getEstado().equals("Cerrado")){
                ticket.mostrarDetalle();
            }
        }
    }

    public static void asignarTecnico(Ticket ticket, Tecnico tecnico){
        ticket.asignarTecnico(tecnico);
    }

    public static void asignarUsuario(Ticket ticket, Usuario usuario){
        ticket.asignarUsuario(usuario);
    }




}
