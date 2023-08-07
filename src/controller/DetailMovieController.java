package controller;

import entity.Movie;
import java.time.LocalTime;
import view.MainWindow;

public class DetailMovieController {
    private Movie movie;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    public void chooseSeat(MainWindow window, String time) {
        window.getWindowController().tampilHalamanKursi(window, this.movie, LocalTime.parse(time));
    }
}
