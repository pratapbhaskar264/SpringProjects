package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Appointment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments() {
        try {
            System.out.println("SERVICE - getAllAppointments");
            return new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in getAllAppointments");
            return new ArrayList<>();
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            System.out.println("SERVICE - getAppointmentById: " + id);
            return new Appointment();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in getAppointmentById");
            return new Appointment();
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            System.out.println("SERVICE - createAppointment");
            return new Appointment();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in createAppointment");
            return new Appointment();
        }
    }

    public void deleteAppointmentById(Long id) {
        try {
            System.out.println("SERVICE - deleteAppointmentById: " + id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in deleteAppointmentById");
        }
    }

    public void updateAppointment(Appointment appointment) {
        try {
            System.out.println("SERVICE - updateAppointment");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in updateAppointment");
        }
    }
}
