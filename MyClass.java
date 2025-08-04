import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TicketSystem system = new TicketSystem();
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        User user = new User(name);
        
        while(true){
           System.out.println("\n===== Movie Ticket Booking =====");
           System.out.println("1. View Shows");
           System.out.println("2. Book Ticket");
           System.out.println("3. View My Bookings");
           System.out.println("4. Exit");
           System.out.print("Choose an option: ");
           int choice = sc. nextInt();
           
           switch (choice){
               case 1:
                   system.displayShows();
                   break;
               case 2:
                   system.displayShows();
                   System.out.print("Enter Show ID to book: ");
                   int id = sc.nextInt();
                   Show selectedShow = system.getShowById(id);
                   
                   if(selectedShow != null){
                       System.out.print("Enter number of seats to book: ");
                       int seats = sc.nextInt();
                       user.bookTicket(selectedShow, seats);
                   }else{
                       System.out.println("Invalid Show ID");
                   }
                   break;
                   case 3:
                       user.viewBookings();
                       break;
                   case 4:
                       System.out.println("Thank you! Visit again.");
                       System.exit(0);
                   default:
                   System.out.println("Invalid Option.");
           }
        }
    }
}
