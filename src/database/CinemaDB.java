package database;

//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource; //untuk mysql neatbeans 8.2
//import com.mysql.jdbc.Connection; //untuk mysql neatbeans 8.2
//import com.mysql.cj.jdbc.MysqlDataSource; //untuk mysql yang terpisah
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection; //untuk mysql yang terpisah
import impl.MovieDaoImpl;
import impl.ShowtimeDaoImpl;
import impl.TransactionDaoImpl;
import impl.UserDaoImpl;
import java.sql.SQLException;
import service.MovieDao;
import service.ShowtimeDao;
import service.TransactionDao;
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
    private static TransactionDao transactionDao;   
    
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            // buat koneksi
            MysqlDataSource dataSource = new MysqlDataSource();
            
            // set nilai URL, username, dan password dari database
            // mac os
//            dataSource.setURL("jdbc:mysql://localhost:8889/cinema");
//            dataSource.setUser("root");
//            dataSource.setPassword("root");
//            
            
            // windows
             dataSource.setURL("jdbc:mysql://localhost:3306/cinema");
             dataSource.setUser("root");
             dataSource.setPassword("");
            
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
    
    public static TransactionDao getTransaction() throws SQLException {
        if (transactionDao == null) {
            transactionDao = new TransactionDaoImpl(getConnection());
        }
        return transactionDao;
    }
}