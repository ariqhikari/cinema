package database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.mysql.jdbc.Connection;
import impl.MovieDaoImpl;
import impl.ShowtimeDaoImpl;
import impl.UserDaoImpl;
import java.sql.SQLException;
import service.MovieDao;
import service.ShowtimeDao;
import service.UserDao;

/**
 *
 * @author ariqhikari
 */
public class CinemaDB {
    private static Connection connection;
    private static MovieDao movieDao;   
    private static UserDao userDao;   
    private static ShowtimeDao showtimeDao;   
    
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            // buat koneksi
            MysqlDataSource dataSource = new MysqlDataSource();
            
            // set nilai URL, username, dan password dari database
            dataSource.setURL("jdbc:mysql://localhost:8889/cinema");
            dataSource.setUser("root");
            dataSource.setPassword("root");
            
            // isi atribut connection
            connection = (Connection) dataSource.getConnection();
        } 
        
        return connection;
    }
    
    public static MovieDao getMovie() throws SQLException {
        if (movieDao == null) {
            movieDao = new MovieDaoImpl(getConnection());
        }
        return movieDao;
    }
    
    public static UserDao getUser() throws SQLException {
        if (userDao == null) {
            userDao = new UserDaoImpl(getConnection());
        }
        return userDao;
    }
    
     public static ShowtimeDao getShowtime() throws SQLException {
        if (showtimeDao == null) {
            showtimeDao = new ShowtimeDaoImpl(getConnection());
        }
        return showtimeDao;
    }
}