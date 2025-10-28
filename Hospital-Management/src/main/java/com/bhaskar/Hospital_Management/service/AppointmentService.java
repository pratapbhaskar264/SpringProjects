package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    public List<Appointment> getAllAppointments() {
        try {
            logger.info("SERVICE - getAllAppointments");
            return new ArrayList<>();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all appointments", e);
            return new ArrayList<>();
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            logger.info("SERVICE - getAppointmentById: {}", id);
            return new Appointment();
        } catch (Exception e) {
            logger.error("An error occurred while fetching appointment with ID: {}", id, e);
            return new Appointment();
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            logger.info("SERVICE - createAppointment");
            return new Appointment();
        } catch (Exception e) {
            logger.error("An error occurred while creating an appointment: {}", appointment, e);
            return new Appointment();
        }
    }

    public void deleteAppointmentById(Long id) {
        try {
            logger.info("SERVICE - deleteAppointmentById: {}", id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting appointment with ID: {}", id, e);
        }
    }

    public void updateAppointment(Appointment appointment) {
        try {
            logger.info("SERVICE - updateAppointment");
        } catch (Exception e) {
            logger.error("An error occurred while updating appointment: {}", appointment, e);
        }
    }
}
