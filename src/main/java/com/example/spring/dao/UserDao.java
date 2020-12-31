package com.example.spring.dao;

import com.example.spring.entity.User;
import com.example.spring.util.DBUtil;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

@Component
public class UserDao {
    @Inject
    private DBUtil<User> dbUtil;

    public List<User> getUser() throws SQLException, ClassNotFoundException{
        return dbUtil.getEntities("SELECT * FROM APPOINTMENT_USERS;", new UserRowMapper());
    }

    public void createUser(User user) throws SQLException, ClassNotFoundException{
        dbUtil.executeSQL(
                "INSERT INTO APPOINTMENT_USERS( USER_NAME, USER_NUMBER)" +
                        "VALUES('"+user.getUserName()+"', '"+ user.getUserNumber()+"');"
        );
    }

    public void updateUser(User user) throws SQLException, ClassNotFoundException{
        dbUtil.executeSQL(
                "UPDATE APPOINTMENT_USERS set USER_NAME = '" +user.getUserName()+ "'"+
                        ",USER_NUMBER = '" + user.getUserNumber()+"'"+
                        "WHERE USER_ID = " + user.getUserId()+";"
        );
    }

    public void deleteUser(int userId) throws SQLException, ClassNotFoundException{
        dbUtil.executeSQL("DELETE FROM APPOINTMENT_USERS WHERE USER_ID = " +userId+ ";");
    }
}
