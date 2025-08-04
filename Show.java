public class Show{
    
    private int showId;
    private String movieName;
    private int availableseats;
    
    public Show(int showId, String movieName, int availableseats){
        this.showId = showId;
        this.movieName = movieName;
        this.availableseats = availableseats;
    }
    
    public int getShowId(){
        return showId;
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getAvailableSeats(){
        return availableseats;
    }
    
    public void bookSeat(int count){
        if(availableseats >= count){
            availableseats -= count;
        }
    }
    
    public void displayInfo(){
        System.out.println("Show ID: " + showId +", Movie: "+ movieName + ", Seats Available: " + availableseats);
    }
}