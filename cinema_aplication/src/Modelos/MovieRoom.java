    package Modelos;

import java.util.LinkedList;

/**
 *
 * @author Lenovo
 */
public class MovieRoom {
    private String name;
    private boolean specialEffects;
    private LinkedList<Chair> busyChairs;
    private LinkedList<Chair> emptyChairs;
    private LinkedList<Show> shows;
    private LinkedList<Ticket> tickets;

    public MovieRoom() {
    }

    public MovieRoom(String name, boolean specialEffects) {
        this.name = name;
        this.specialEffects = specialEffects;
        this.busyChairs = new LinkedList<>();
        this.emptyChairs = new LinkedList<>();
        this.shows = new LinkedList<>();
        this.tickets = new LinkedList<>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the specialEffects
     */
    public boolean isSpecialEffects() {
        return specialEffects;
    }

    /**
     * @param specialEffects the specialEffects to set
     */
    public void setSpecialEffects(boolean specialEffects) {
        this.specialEffects = specialEffects;
    }

    /**
     * @return the shows
     */
    public LinkedList<Show> getShows() {
        return shows;
    }

    /**
     * @param shows the shows to set
     */
    public void setShows(LinkedList<Show> shows) {
        this.shows = shows;
    }

    /**
     * @return the busyChairs
     */
    public LinkedList<Chair> getBusyChairs() {
        return busyChairs;
    }

    /**
     * @param busyChairs the busyChairs to set
     */
    public void setBusyChairs(LinkedList<Chair> busyChairs) {
        this.busyChairs = busyChairs;
    }

    /**
     * @return the emptyChairs
     */
    public LinkedList<Chair> getEmptyChairs() {
        return emptyChairs;
    }

    /**
     * @param emptyChairs the emptyChairs to set
     */
    public void setEmptyChairs(LinkedList<Chair> emptyChairs) {
        this.emptyChairs = emptyChairs;
    }

    /**
     * @return the tickets
     */
    public LinkedList<Ticket> getTickets() {
        return tickets;
    }

    /**
     * @param tickets the tickets to set
     */
    public void setTickets(LinkedList<Ticket> tickets) {
        this.tickets = tickets;
    }
    
}
