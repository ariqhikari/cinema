package entity;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author ariqhikari
 */
public class Movie {
    private Integer id;
    private String title;
    private String description;
    private Date releaseDate;
    private String duration;
    private String poster;
    private double rating;
    private Integer ageRating;
    private Integer price;
    private List<String> genres; 
    
    public Movie() {
        
    }
    
    public Movie(String title, String description, Date releaseDate, String duration, String poster, double rating, Integer ageRating, Integer price, List<String> genres) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.poster = poster;
        this.rating = rating;
        this.ageRating = ageRating;
        this.price = price;
        this.genres = genres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(Integer ageRating) {
        this.ageRating = ageRating;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
    
    public String getGenresString() {
        return String.join(", ", this.genres);
    }
    
    public String getDateString() {
        String pattern = "dd MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateFormat = simpleDateFormat.format(this.releaseDate);
        
        return dateFormat;
    }
    
    public String getPriceString() {
        Locale id = new Locale("id", "ID");
        Currency rupiah = Currency.getInstance(id);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(id);
        String priceString = formatter.format(Double.valueOf(this.price));
        
        return priceString;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.title);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.releaseDate);
        hash = 23 * hash + Objects.hashCode(this.duration);
        hash = 23 * hash + Objects.hashCode(this.poster);
        hash = 23 * hash + Objects.hashCode(this.rating);
        hash = 23 * hash + Objects.hashCode(this.ageRating);
        hash = 23 * hash + Objects.hashCode(this.price);
        hash = 23 * hash + Objects.hashCode(this.genres);
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
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }
        if (!Objects.equals(this.duration, other.duration)) {
            return false;
        }
        if (!Objects.equals(this.poster, other.poster)) {
            return false;
        }
        if (!Objects.equals(this.rating, other.rating)) {
            return false;
        }
        if (!Objects.equals(this.ageRating, other.ageRating)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.genres, other.genres)) {
            return false;
        }
        return true;
    }
}
