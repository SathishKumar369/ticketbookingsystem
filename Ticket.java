public class Ticket{
    private Show show;
    private int seatCount;
    
    public Ticket(Show show, int seatCount){
        this.show =  show;
        this.seatCount = seatCount;
    }
    
    public void displayTicket(){
        System.out.println("Ticket for Movie: " + show.getMovieName());
        System.out.println("Seats Booked: " + seatCount);
    }
}