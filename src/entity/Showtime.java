package entity;

import java.time.LocalTime;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author ariqhikari
 */
public class Showtime {
    private Integer id;
    private Integer movieId;
    private LocalTime time;
    private Map<String, Object> seats;
    
    public Showtime() {
        
    }
    
    public Showtime(Integer movieId, LocalTime time, Map<String, Object> seats) {
        this.movieId = movieId;
        this.time = time;
        this.seats = seats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Map<String, Object> getSeats() {
        return seats;
    }

    public void setSeats(Map<String, Object> seats) {
        this.seats = seats;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.movieId);
        hash = 17 * hash + Objects.hashCode(this.time);
        hash = 17 * hash + Objects.hashCode(this.seats);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Showtime other = (Showtime) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.seats, other.seats)) {
            return false;
        }
        return true;
    }
    
    
}
