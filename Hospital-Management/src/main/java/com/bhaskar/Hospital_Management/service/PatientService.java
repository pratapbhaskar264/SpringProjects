package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.Repository.PatientRepository;
import com.bhaskar.Hospital_Management.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @Autowired
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

    public Patient getPatientById(Long id) {  //use optional as wrapper rather than using null
        try {
            Optional<Patient> patient = patientRepository.findById(id);
            return patient.orElse(null);
        } catch (Exception e) {
            logger.error("An error occurred while fetching patient with ID: {}", id, e);
            return null;
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

    public void updatePatient(Long id,Patient patient) {
        try {
            System.out.println("SERVICE - updatePatient");
            Optional<Patient> temp = patientRepository.findById(id);
            if(temp.isPresent()){
                Patient p = temp.get();
                p.setName(patient.getName());
                p.setAge(patient.getAge());
                p.setGender(patient.getGender());
                patientRepository.save(p);
            }
            else{
                logger.error("Patient with id : {} not found",id);
            }

        } catch (Exception e) {
            logger.error("An error occurred while updating patient: {}", patient, e);
        }
    }
}
