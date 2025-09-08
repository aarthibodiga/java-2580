package CRM;

import java.time.LocalDate;

public class Supportticket {
    public static void main(String[] args){
        int TicketID = 2309912;
        String TicketSubject = "About Product Details";
        String TicketStatus = "Open";
        LocalDate TicketCreationDate = LocalDate.of(2025,8,14);
        String TicketAssignedTo = "Jhon Ceaser";
        String TicketRequester = "Ritish";
        System.out.println("Ticket ID is:" + TicketID);
        System.out.println( "Ticket Subject is: " + TicketSubject);
        System.out.println("Ticket Status: " + TicketStatus);
        System.out.println("Ticket Creation Date: " + TicketCreationDate);
        System.out.println("Ticket Assigned To: " + TicketAssignedTo);;
        System.out.println("Ticket Requester: " + TicketRequester);


        







    }
    
}
