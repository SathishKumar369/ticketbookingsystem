import java.util.ArrayList;
import java.util.List;

public class TicketSystem{
    
    private List<Show> shows;
    
    public TicketSystem(){
        shows = new ArrayList<>();
        shows.add(new Show(1, "Avengers: Endgame", 10));
        shows.add(new Show(2, "Inception", 5));
        shows.add(new Show(3, "Intersteller", 7));
        shows.add(new Show(4, "Mission Possible 6", 15));
        shows.add(new Show(5, "Final Destination 4", 20));
        shows.add(new Show(6, "Best World", 10));
    }
    
    public void displayShows(){
        System.out.println("Available Shows:");
        for(Show show : shows){
            show.displayInfo();
        }
    }
    
    public Show getShowById(int id){
       for(Show show : shows){
           if(show.getShowId() == id) return show;
       } 
       return null;
    }
}