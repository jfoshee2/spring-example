package com.example.spring.controller;

import com.example.spring.entity.Appointment;
import com.example.spring.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Inject
    private AppointmentService appointmentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Appointment> getAppointments() throws SQLException, ClassNotFoundException {
        return appointmentService.getAppointments();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createAppointment(@RequestBody Appointment appointment) throws SQLException, ClassNotFoundException {
        appointmentService.createAppointment(appointment);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateAppointment(@RequestBody Appointment appointment) throws SQLException, ClassNotFoundException {
        appointmentService.updateAppointment(appointment);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteAppointment(@PathVariable("id") int appointmentId) throws SQLException, ClassNotFoundException {
        appointmentService.deleteAppointment(appointmentId);
    }
}
