package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.Repository.AppointmentRepository;
import com.bhaskar.Hospital_Management.models.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        try {
            logger.info("SERVICE - getAllAppointments");
            return appointmentRepository.findAll();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all appointments", e);
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            logger.info("SERVICE - getAppointmentById: {}", id);
            Optional<Appointment> appointment = appointmentRepository.findById(id);
            return appointment.orElse(null); // Return null if not found
        } catch (Exception e) {
            logger.error("An error occurred while fetching appointment with ID: {}", id, e);
            return null; // Return null on error
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            logger.info("SERVICE - createAppointment");
            return appointmentRepository.save(appointment);
        } catch (Exception e) {
            logger.error("An error occurred while creating an appointment: {}", appointment, e);
            return null;
        }
    }

    public void deleteAppointmentById(Long id) {
        try {
            logger.info("SERVICE - deleteAppointmentById: {}", id);
            appointmentRepository.deleteById(id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting appointment with ID: {}", id, e);
        }
    }

    public void updateAppointment(Appointment appointment, Long id) {
        try {
            logger.info("SERVICE - updateAppointment");
            Optional<Appointment> tempAppointment = appointmentRepository.findById(id);

            if (tempAppointment.isPresent()) {
                Appointment existingAppointment = tempAppointment.get();

                existingAppointment.setPatientId(appointment.getPatientId());
                existingAppointment.setDoctorId(appointment.getDoctorId());
                existingAppointment.setDate(appointment.getDate());

                appointmentRepository.save(existingAppointment);
            } else {
                logger.error("Appointment with id : {} not found", id);
            }
        } catch (Exception e) {
            logger.error("An error occurred while updating appointment: {}", appointment, e);
        }
    }
}