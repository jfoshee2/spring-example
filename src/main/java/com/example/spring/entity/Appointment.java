package com.example.spring.entity;

import java.util.Date;

public class Appointment extends Entity {

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

    private Appointment(AppointmentBuilder builder) {
        this.appointmentId = builder.appointmentId;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.appointmentDate = builder.appointmentDate;
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

    public static class AppointmentBuilder {

        private int appointmentId;
        private String name;
        private int phoneNumber;
        private Date appointmentDate;

        public Appointment build() {
            return new Appointment(this);
        }

        public AppointmentBuilder withAppointmentId(int appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }

        public AppointmentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public AppointmentBuilder withPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public AppointmentBuilder withAppointmentDate(Date appointmentDate) {
            this.appointmentDate = appointmentDate;
            return this;
        }

    }
}
