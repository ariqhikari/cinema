package service;

import entity.Movie;
import exception.MovieException;
import java.util.List;
/**
 *
 * @author ariqhikari
 */
public interface MovieDao {
    public List<Movie> selectAllMovie() throws MovieException;
}



