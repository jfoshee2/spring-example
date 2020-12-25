package com.example.spring.dao;

import com.example.spring.entity.Appointment;
import com.example.spring.util.DBUtil;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

@Component
public class AppointmentDao {

    @Inject
    private DBUtil<Appointment> dbUtil;

    public List<Appointment> getAppointments() throws SQLException, ClassNotFoundException {
        return dbUtil.getEntities("SELECT * FROM APPOINTMENTS;", new AppointmentRowMapper());
    }
}
