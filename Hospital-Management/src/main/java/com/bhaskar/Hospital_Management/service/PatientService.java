package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients() {
        try {
            System.out.println("SERVICE - getAllPatients");
            return new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in getAllPatients");
            return new ArrayList<>();
        }
    }

    public Patient getPatientById(Long id) {
        try {
            System.out.println("SERVICE - getPatientById: " + id);
            return new Patient();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in getPatientById");
            return new Patient();
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            System.out.println("SERVICE - createPatient");
            return new Patient();  // placeholder
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in createPatient");
            return new Patient();
        }
    }

    public void deletePatientById(Long id) {
        try {
            System.out.println("SERVICE - deletePatientById: " + id);
            // delete logic
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in deletePatientById");
        }
    }

    public void updatePatient(Patient patient) {
        try {
            System.out.println("SERVICE - updatePatient");
            // update logic
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in updatePatient");
        }
    }
}
