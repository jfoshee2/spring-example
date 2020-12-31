package com.example.spring.service;

import com.example.spring.dao.UserDao;
import com.example.spring.entity.User;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

@Component
public class UserService {
    @Inject
    private UserDao userDao;

    public List<User> getUser() throws SQLException, ClassNotFoundException {
        return userDao.getUser();
    }

    public void createUser(User user) throws SQLException, ClassNotFoundException{
        userDao.createUser(user);
    }

    public void updateUser(User user) throws SQLException, ClassNotFoundException{
        userDao.updateUser(user);
    }

    public void deleteUser(int userId) throws SQLException, ClassNotFoundException{
        userDao.deleteUser(userId);
    }
}
