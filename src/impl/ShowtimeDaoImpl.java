package impl;

import com.mysql.jdbc.Connection;  //untuk mysql neatbeans 8.2
// import java.sql.Connection;
import java.sql.PreparedStatement;
import entity.Showtime;
import exception.ShowtimeException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import org.json.JSONObject;
import service.ShowtimeDao;

/**
 *
 * @author ariqhikari
 */
public class ShowtimeDaoImpl implements ShowtimeDao{
    private Connection connection;
    
    private final String getByMovieIdTime = "SELECT * from showtimes"
                                + " WHERE movieId = ? AND"
                                + " time = ?";
    
    public ShowtimeDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Showtime getShowtime(Integer movieId, LocalTime time) throws ShowtimeException {
        PreparedStatement statement = null;
        
        try {
            // isi statement dengan query SELECT
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByMovieIdTime);
            statement.setInt(1, movieId);
            statement.setTime(2, Time.valueOf(time));
            ResultSet result = statement.executeQuery();
            
            Showtime showtime = null;
            // buat validasi untuk mengecek apakah ada record
            if(result.next()) {
                // set hasil query ke object showtime
                showtime = new Showtime();
                showtime.setId(result.getInt("id"));
                showtime.setMovieId(result.getInt("movieId"));
                
                Time sqlTime = result.getTime("time");
                LocalTime localTime = sqlTime.toLocalTime();
                showtime.setTime(localTime);
                
                JSONObject jsonSeats = new JSONObject(result.getString("seats"));
                showtime.setSeats(jsonSeats.toMap());
                
                connection.commit();
            } else {
                try {
                    connection.rollback();
                } catch (Exception e) {
                }
                throw new ShowtimeException("Data Showtime dengan movieId = " + movieId
                        + " Tidak Ditemukan didalam Database");
            }
            
            return showtime;
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            throw new ShowtimeException(ex.getMessage());
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
