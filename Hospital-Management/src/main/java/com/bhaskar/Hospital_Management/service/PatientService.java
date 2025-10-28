package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.Repository.PatientRepository;
import com.bhaskar.Hospital_Management.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);
    private PatientRepository patientRepository;
    public List<Patient> getAllPatients() {
        try {
            System.out.println("SERVICE - getAllPatients");
            return patientRepository.findAll();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all patients", e);
            return new ArrayList<>();
        }
    }

    public Optional<Patient> getPatientById(Long id) {  //use optional as wrapper rather than using null
        try {
            return patientRepository.findById(id);
        } catch (Exception e) {
            logger.error("An error occurred while fetching patient with ID: {}", id, e);
            return Optional.of(new Patient());
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            System.out.println("SERVICE - createPatient");
//            return new Patient();  // placeholder
            return patientRepository.save(patient);
        } catch (Exception e) {
            logger.error("An error occurred while creating a patient: {}", patient, e);
            return new Patient();
        }
    }

    public void deletePatientById(Long id) {
        try {
            // delete logic
            patientRepository.deleteById(id);
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
