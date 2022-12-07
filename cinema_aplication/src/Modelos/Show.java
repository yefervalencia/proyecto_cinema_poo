package Modelos;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Lenovo
 */
public class Show {
    private Date date;
    private LinkedList<MovieRoom> movieRoom;
    private Movie movie;
    private LinkedList<Show>shows;

    public Show() {
    }

    public Show(Date date, Movie movie) {
        this.date = date;
        this.movieRoom = new LinkedList<>();
        this.movie = movie;
        this.shows = new LinkedList<>();
    }

    

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @param movie the movie to set
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * @return the movieRoom
     */
    public LinkedList<MovieRoom> getMovieRoom() {
        return movieRoom;
    }

    /**
     * @param movieRoom the movieRoom to set
     */
    public void setMovieRoom(LinkedList<MovieRoom> movieRoom) {
        this.movieRoom = movieRoom;
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
    
}
