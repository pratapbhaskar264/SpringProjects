package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Patient> getAllPatients() {
        try {
            System.out.println("SERVICE - getAllPatients");
            return new ArrayList<>();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all patients", e);
            return new ArrayList<>();
        }
    }

    public Patient getPatientById(Long id) {
        try {
            System.out.println("SERVICE - getPatientById: " + id);
            return new Patient();
        } catch (Exception e) {
            logger.error("An error occurred while fetching patient with ID: {}", id, e);
            return new Patient();
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            System.out.println("SERVICE - createPatient");
            return new Patient();  // placeholder
        } catch (Exception e) {
            logger.error("An error occurred while creating a patient: {}", patient, e);
            return new Patient();
        }
    }

    public void deletePatientById(Long id) {
        try {
            System.out.println("SERVICE - deletePatientById: " + id);
            // delete logic
        } catch (Exception e) {
            logger.error("An error occurred while deleting patient with ID: {}", id, e);
        }
    }

    public void updatePatient(Patient patient) {
        try {
            System.out.println("SERVICE - updatePatient");
            // update logic
        } catch (Exception e) {
            logger.error("An error occurred while updating patient: {}", patient, e);
        }
    }
}
