package com.example.spring.dao;

import com.example.spring.entity.Appointment;
import com.example.spring.util.DBUtil;

import java.sql.SQLException;
import java.util.List;

public class AppointmentDao {

    DBUtil<Appointment> dbUtil = new DBUtil<>();

    public List<Appointment> getAppointments() throws SQLException, ClassNotFoundException {
        return dbUtil.getEntities("SELECT * FROM APPOINTMENTS;", new AppointmentRowMapper());
    }
}
