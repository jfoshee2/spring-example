package com.example.spring.controller;

import com.example.spring.entity.Appointment;
import com.example.spring.service.AppointmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

@RestController
public class AppointmentController {

    //private AppointmentService appointmentService = new AppointmentService();

    @Inject
    private AppointmentService appointmentService;

    @RequestMapping(value = "/appointments", method = RequestMethod.GET)
    public List<Appointment> getAppointments() throws SQLException, ClassNotFoundException {
        return appointmentService.getAppointments();
    }
}
