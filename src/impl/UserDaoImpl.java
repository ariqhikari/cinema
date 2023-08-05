package impl;

import com.mysql.jdbc.Connection;
import entity.User;
import exception.UserException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import service.UserDao;

/**
 *
 * @author ariqhikari
 */
public class UserDaoImpl implements UserDao {
    private Connection connection;
    
    private final String getByUsernamePassword = "SELECT * from users "
                                    + "WHERE username = ? "
                                    + "AND password = SHA1(?)";
    
    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User getUser(String username, String password) throws UserException {
        PreparedStatement statement = null;
        
        try {
            // isi statement dengan query SELECT
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByUsernamePassword);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            
            User user = null;
            // buat validasi untuk mengecek apakah ada record
            if(result.next()) {
                // set hasil query ke object anggota
                user = new User();
                user.setId(result.getInt("id"));
                user.setName(result.getString("name"));
                user.setUsername(result.getString("username"));
                user.setPassword(result.getString("password"));
                connection.commit();
            } else {
                try {
                    connection.rollback();
                } catch (Exception e) {
                }
                throw new UserException("Data User dengan Username = " + username
                        + " Tidak Ditemukan didalam Database");
            }
            
            return user;
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (Exception e) {
            }
            throw new UserException(ex.getMessage());
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
