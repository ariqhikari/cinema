package controller;

import entity.Movie;
import entity.Showtime;

/**
 *
 * @author ariqhikari
 */
public class SeatController {
    private Movie movie;
    private Showtime showtime;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }
    
    
}
