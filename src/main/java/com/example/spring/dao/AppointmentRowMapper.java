package com.example.spring.dao;

import com.example.spring.entity.Appointment;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AppointmentRowMapper implements IRowMapper<Appointment> {

    @Override
    public Appointment mapRow(ResultSet rs) throws SQLException {
        return new Appointment.AppointmentBuilder()
                .withAppointmentId(rs.getInt("APPOINTMENT_ID"))
                .withName(rs.getString("NAME"))
                .withPhoneNumber(rs.getInt("PHONE_NUMBER"))
                .withAppointmentDate(rs.getDate("APPOINTMENT_DATE"))
                .build();
    }

}
