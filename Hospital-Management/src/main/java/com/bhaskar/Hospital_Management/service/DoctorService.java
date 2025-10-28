package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.Repository.DoctorRepository;
import com.bhaskar.Hospital_Management.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        try {
            logger.info("SERVICE - getAllDoctors");
            return doctorRepository.findAll();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all doctors", e);
            return new ArrayList<>();
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            logger.info("SERVICE - getDoctorById: {}", id);
            Optional<Doctor> doctor = doctorRepository.findById(id);
            return doctor.orElse(null);
        } catch (Exception e) {
            logger.error("An error occurred while fetching doctor with ID: {}", id, e);
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            logger.info("SERVICE - createDoctor");
            return doctorRepository.save(doctor);
        } catch (Exception e) {
            logger.error("An error occurred while creating a doctor: {}", doctor, e);
            return new Doctor();
        }
    }

    public void deleteDoctorById(Long id) {
        try {
            logger.info("SERVICE - deleteDoctorById: {}", id);
            doctorRepository.deleteById(id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting doctor with ID: {}", id, e);
        }
    }

    public void updateDoctor(Doctor doctor , Long id) {
        try {
            logger.info("SERVICE - updateDoctor");
            Optional<Doctor> tempdoctor = doctorRepository.findById(id);
            if(tempdoctor.isPresent()){
                Doctor p = tempdoctor.get();
                p.setName(doctor.getName());
                p.setSpeciality(doctor.getSpeciality());

                doctorRepository.save(p);
            }
            else{
                logger.error("Patient with id : {} not found " , id);
            }
        } catch (Exception e) {
            logger.error("An error occurred while updating doctor: {}", doctor, e);
        }
    }
}
