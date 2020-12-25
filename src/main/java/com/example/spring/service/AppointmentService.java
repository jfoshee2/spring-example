package com.example.spring.service;

import com.example.spring.dao.AppointmentDao;
import com.example.spring.entity.Appointment;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

@Component
public class AppointmentService {

    @Inject
    private AppointmentDao appointmentDao;

    public List<Appointment> getAppointments() throws SQLException, ClassNotFoundException {
        return appointmentDao.getAppointments();
    }
}
