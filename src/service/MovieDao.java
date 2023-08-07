package service;

import entity.Movie;
import exception.MovieException;
import java.util.List;

public interface MovieDao {
    public List<Movie> selectAllMovie() throws MovieException;
}



