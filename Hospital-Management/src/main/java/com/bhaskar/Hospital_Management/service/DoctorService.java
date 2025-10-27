package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors() {
        try {
            System.out.println("SERVICE - getAllDoctors");
            return new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in getAllDoctors");
            return new ArrayList<>();
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            System.out.println("SERVICE - getDoctorById: " + id);
            return new Doctor();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in getDoctorById");
            return new Doctor();
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            System.out.println("SERVICE - createDoctor");
            return new Doctor();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in createDoctor");
            return new Doctor();
        }
    }

    public void deleteDoctorById(Long id) {
        try {
            System.out.println("SERVICE - deleteDoctorById: " + id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in deleteDoctorById");
        }
    }

    public void updateDoctor(Doctor doctor) {
        try {
            System.out.println("SERVICE - updateDoctor");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in updateDoctor");
        }
    }
}
