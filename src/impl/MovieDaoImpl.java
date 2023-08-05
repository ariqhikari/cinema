package impl;

import com.mysql.jdbc.Connection;
import entity.Movie;
import exception.MovieException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import service.MovieDao;

/**
 *
 * @author ariqhikari
 */
public class MovieDaoImpl implements MovieDao {
    private Connection connection;
    
    private final String getById = "SELECT * from movies "
                                    + "WHERE id = ? ";
    
    private final String selectAll = "SELECT * from movies";
    
    public MovieDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Movie getMovie(Integer id) throws MovieException {
        PreparedStatement statement = null;
        
        try {
            // isi statement dengan query SELECT
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            Movie movie = null;
            // buat validasi untuk mengecek apakah ada record
            if(result.next()) {
                // set hasil query ke object movie
                movie = new Movie();
                movie.setId(result.getInt("id"));
                movie.setTitle(result.getString("title"));
                movie.setDescription(result.getString("description"));
                
//                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(result.getString("release_date"));  
//                movie.setReleaseDate(date);
//                System.out.println(date.toString());

                movie.setDuration(result.getString("duration"));
                movie.setPoster(result.getString("poster"));
                movie.setRating(result.getDouble("rating"));
                movie.setAgeRating(result.getInt("age_rating"));
//                movie.setGenres(result.getArray("genres"));
                connection.commit();
            } else {
                try {
                    connection.rollback();
                } catch (Exception e) {
                }
                throw new MovieException("Data Movie dengan ID = " + id
                        + " Tidak Ditemukan didalam Database");
            }
            
            return movie;
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            throw new MovieException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (Exception e) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                }
            }
        }
    }

    @Override
    public List<Movie> selectAllMovie() throws MovieException {
        PreparedStatement statement = null;
        List<Movie> list = new ArrayList<Movie>();
        
        try {
            // isi statement dengan query SELECT
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(selectAll);
            ResultSet result = statement.executeQuery();
            
            Movie movie = null;
            // buat validasi untuk mengecek apakah ada record
            while(result.next()) {
                // set hasil query ke object movie
                movie = new Movie();
                movie.setId(result.getInt("id"));
                movie.setTitle(result.getString("title"));
                movie.setDescription(result.getString("description"));
                
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(result.getString("release_date"));  
                movie.setReleaseDate(date);
                 
                movie.setDuration(result.getString("duration"));
                movie.setPoster(result.getString("poster"));
                movie.setRating(result.getDouble("rating"));
                movie.setAgeRating(result.getInt("age_rating"));
                movie.setPrice(result.getInt("price"));
                
                JSONArray jsonGenres = new JSONArray(result.getString("genres"));
                List<String> genres = new ArrayList<>(jsonGenres.toList().size());
                jsonGenres.toList().forEach((genre) -> {
                    genres.add(Objects.toString(genre, null));
                });
                
                movie.setGenres(genres);
                
                list.add(movie);
            } 
            
            connection.commit();
            return list;
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            throw new MovieException(ex.getMessage());
        } catch (ParseException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            throw new MovieException(ex.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (Exception e) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
