package com.example.spring.dao;

import com.example.spring.entity.Appointment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class AppointmentDao {

    public List<Appointment> getAppointments() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        String url = System.getenv("DB_URL");


        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM APPOINTMENTS;");

        List<Appointment> result = new ArrayList<>();

        // while there are rows to iterate through
        while (resultSet.next()) {
            result.add(new Appointment(
                    resultSet.getInt("APPOINTMENT_ID"),
                    resultSet.getString("NAME"),
                    resultSet.getInt("PHONE_NUMBER"),
                    resultSet.getDate("APPOINTMENT_DATE")
            ));
        }

        conn.close();
        statement.close();

        return result;
    }
}
