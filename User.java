import java.util.ArrayList;
import java.util.List;

public class User{
    private String name;
    private List<Ticket> bookings;
    
    
    public User(String name){
        this.name = name;
        this.bookings = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void bookTicket(Show show, int seats){
        if(show.getAvailableSeats() >= seats){
            show.bookSeat(seats);
            Ticket ticket = new Ticket(show, seats);
            bookings.add(ticket);
            System.out.println("Booking successful!");
        }else{
            System.out.println("Not enough seats available.");
        }
    }
    
    public void viewBookings(){
        System.out.println("Booking History for " + name + ":");
       for(Ticket ticket: bookings){
           ticket.displayTicket();
           System.out.println("-------------------------------");
       } 
    
    }
}