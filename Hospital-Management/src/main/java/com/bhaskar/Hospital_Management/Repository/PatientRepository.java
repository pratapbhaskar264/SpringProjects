package com.bhaskar.Hospital_Management.Repository;

import com.bhaskar.Hospital_Management.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository<Patient> extends JpaRepository<Patient, Long> {
}
