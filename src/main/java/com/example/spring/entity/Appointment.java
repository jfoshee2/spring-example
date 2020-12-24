package com.example.spring.entity;

import java.util.Date;

public class Appointment {

    private int appointmentId;
    private String name;
    private int phoneNumber;
    private Date appointmentDate;

    public Appointment(int appointmentId, String name, int phoneNumber, Date appointmentDate) {
        this.appointmentId = appointmentId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.appointmentDate = appointmentDate;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
