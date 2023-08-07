package model;

import database.CinemaDB;
import entity.User;
import event.UserListener;
import exception.UserException;
import java.sql.SQLException;
import service.UserDao;

/**
 *
 * @author ariqhikari
 */
public class UserModel {
    private int id;
    private String name;
    private String username;
    private String password;
    
    private UserListener listener;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserListener getListener() {
        return listener;
    }

    public void setListener(UserListener listener) {
        this.listener = listener;
    }
    
    public void resetUser() {
        this.setId(0);
        this.setName("");
        this.setUsername("");
        this.setPassword("");
        this.fireOnChange();
    }
    
    public void loginUser() throws SQLException, UserException {
        UserDao dao = CinemaDB.getUser();
        
        User user = dao.getUser(this.username, this.password);
        this.setId(user.getId());
        this.setName(user.getName());
    }
    
    protected void fireOnChange() {
        if(listener != null) {
            listener.onChange(this);
        }
    }
}
