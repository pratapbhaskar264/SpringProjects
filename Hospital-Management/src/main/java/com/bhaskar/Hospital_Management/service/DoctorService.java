package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    public List<Doctor> getAllDoctors() {
        try {
            logger.info("SERVICE - getAllDoctors");
            return new ArrayList<>();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all doctors", e);
            return new ArrayList<>();
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            logger.info("SERVICE - getDoctorById: {}", id);
            return new Doctor();
        } catch (Exception e) {
            logger.error("An error occurred while fetching doctor with ID: {}", id, e);
            return new Doctor();
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            logger.info("SERVICE - createDoctor");
            return new Doctor();
        } catch (Exception e) {
            logger.error("An error occurred while creating a doctor: {}", doctor, e);
            return new Doctor();
        }
    }

    public void deleteDoctorById(Long id) {
        try {
            logger.info("SERVICE - deleteDoctorById: {}", id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting doctor with ID: {}", id, e);
        }
    }

    public void updateDoctor(Doctor doctor) {
        try {
            logger.info("SERVICE - updateDoctor");
        } catch (Exception e) {
            logger.error("An error occurred while updating doctor: {}", doctor, e);
        }
    }
}
