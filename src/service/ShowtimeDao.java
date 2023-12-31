package service;

import entity.Showtime;
import exception.ShowtimeException;
import java.time.LocalTime;

public interface ShowtimeDao {
    public Showtime getShowtime(Integer movieId, LocalTime time) throws ShowtimeException;
    public void updateShowtime(Showtime showtime) throws ShowtimeException;
}
