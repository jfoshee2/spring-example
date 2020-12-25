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

    public void createAppointment(Appointment appointment) throws SQLException, ClassNotFoundException {
        dbUtil.executeSQL(
                "INSERT INTO APPOINTMENTS(NAME, PHONE_NUMBER, APPOINTMENT_DATE)" +
                        "VALUES('" + appointment.getName() + "', " + appointment.getPhoneNumber() + ", '" +
                        appointment.getAppointmentDate() + "');"
        );
    }

    public void updateAppointment(Appointment appointment) throws SQLException, ClassNotFoundException {
        dbUtil.executeSQL(
                "UPDATE APPOINTMENTS SET NAME = '" + appointment.getName() + "'" +
                        ", PHONE_NUMBER = " + appointment.getPhoneNumber() + ", " +
                        " APPOINTMENT_DATE = '" + appointment.getAppointmentDate() + "'" +
                        "WHERE APPOINTMENT_ID = " + appointment.getAppointmentId() + ";"
        );
    }

    public void deleteAppointment(int appointmentId) throws SQLException, ClassNotFoundException {
        dbUtil.executeSQL("DELETE FROM APPOINTMENTS WHERE APPOINTMENT_ID = " + appointmentId + ";");
    }
}
