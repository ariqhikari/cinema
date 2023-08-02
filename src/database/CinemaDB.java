package database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.mysql.jdbc.Connection;
import impl.MovieDaoImpl;
import java.sql.SQLException;
import service.MovieDao;

/**
 *
 * @author ariqhikari
 */
public class CinemaDB {
    private static Connection connection;
    private static MovieDao movieDao;   
    
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
}
