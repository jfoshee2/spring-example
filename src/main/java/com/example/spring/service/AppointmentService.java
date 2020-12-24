package com.example.spring.service;

import com.example.spring.dao.AppointmentDao;
import com.example.spring.entity.Appointment;

import java.sql.SQLException;
import java.util.List;

public class AppointmentService {

    private AppointmentDao appointmentDao = new AppointmentDao();

    public List<Appointment> getAppointments() throws SQLException, ClassNotFoundException {
        return appointmentDao.getAppointments();
    }
}
