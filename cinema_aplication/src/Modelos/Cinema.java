package Modelos;

import java.util.LinkedList;

/**
 *
 * @author Lenovo
 */
public class Cinema {
    private LinkedList<User> users;
    private LinkedList<Show>shows;
    private LinkedList<MovieRoom>movieRooms;

    public Cinema() {
        this.users=new LinkedList<>();
        this.shows = new LinkedList<>();
        this.movieRooms = new LinkedList<>();
    }

    /**
     * @return the users
     */
    public LinkedList<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(LinkedList<User> users) {
        this.users = users;
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
     * @return the movieRooms
     */
    public LinkedList<MovieRoom> getMovieRooms() {
        return movieRooms;
    }

    /**
     * @param movieRooms the movieRooms to set
     */
    public void setMovieRooms(LinkedList<MovieRoom> movieRooms) {
        this.movieRooms = movieRooms;
    }
    
    
    
}
