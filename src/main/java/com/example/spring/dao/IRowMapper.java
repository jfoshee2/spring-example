package com.example.spring.dao;

import com.example.spring.entity.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IRowMapper<T extends Entity> {

    T mapRow(ResultSet rs) throws SQLException;
}
