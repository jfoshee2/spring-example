package com.example.spring.dao;


import com.example.spring.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements IRowMapper<User>{
    @Override
    public User mapRow(ResultSet rs) throws SQLException {
        return new User.UserBuilder()
                .withUserId(rs.getInt("USER_ID"))
                .withUserName(rs.getString("USER_NAME"))
                .withUserNumber(rs.getString("USER_NUMBER"))
                .build();
    }
}
