package service;

import entity.User;
import exception.UserException;

public interface UserDao {
    public User getUser(String username, String password) throws UserException;
}