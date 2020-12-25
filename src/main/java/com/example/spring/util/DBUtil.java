package com.example.spring.util;

import com.example.spring.dao.IRowMapper;
import com.example.spring.entity.Entity;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class DBUtil<T extends Entity> {

    public List<T> getEntities(String sql, IRowMapper<T> rowMapper) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        String url = System.getenv("DB_URL");


        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        List<T> result = new ArrayList<>();
        while (resultSet.next()) {
            result.add(rowMapper.mapRow(resultSet));
        }

        conn.close();
        statement.close();

        return result;
    }

    public T getSingleEntity(String sql, IRowMapper<T> rowMapper) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        String url = System.getenv("DB_URL");


        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        T result = rowMapper.mapRow(resultSet);

        conn.close();
        statement.close();

        return result;
    }

    public void executeSQL(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        String url = System.getenv("DB_URL");


        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();

        statement.executeUpdate(sql);

        conn.close();
        statement.close();
    }

}
