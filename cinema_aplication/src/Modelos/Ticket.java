package Modelos;

/**
 *
 * @author Lenovo
 */
public class Ticket {
    private double priceToPay;
    private String type;
    private MovieRoom movieRoom;
    private Show show;
    private Chair chair;

    public Ticket() {
    }

    public Ticket(double priceToPay, String type, MovieRoom movieRoom, Show show, Chair chair) {
        this.priceToPay = priceToPay;
        this.type = type;
        this.movieRoom = movieRoom;
        this.show = show;
        this.chair = chair;
    }

    /**
     * @return the priceToPay
     */
    public double getPriceToPay() {
        return priceToPay;
    }

    /**
     * @param priceToPay the priceToPay to set
     */
    public void setPriceToPay(double priceToPay) {
        this.priceToPay = priceToPay;
    }
    
    /**
     * @return the movieRoom
     */
    public MovieRoom getMovieRoom() {
        return movieRoom;
    }

    /**
     * @param movieRoom the movieRoom to set
     */
    public void setMovieRoom(MovieRoom movieRoom) {
        this.movieRoom = movieRoom;
    }

    /**
     * @return the show
     */
    public Show getShow() {
        return show;
    }

    /**
     * @param show the show to set
     */
    public void setShow(Show show) {
        this.show = show;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the chair
     */
    public Chair getChair() {
        return chair;
    }

    /**
     * @param chair the chair to set
     */
    public void setChair(Chair chair) {
        this.chair = chair;
    }
    
    
}
