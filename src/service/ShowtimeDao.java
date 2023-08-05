package service;

import entity.Showtime;
import exception.ShowtimeException;
import java.time.LocalTime;

/**
 *
 * @author ariqhikari
 */
public interface ShowtimeDao {
    public Showtime getShowtime(Integer movieId, LocalTime time) throws ShowtimeException;
}
