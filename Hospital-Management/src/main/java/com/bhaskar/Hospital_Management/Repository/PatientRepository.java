package com.bhaskar.Hospital_Management.Repository;

import com.bhaskar.Hospital_Management.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
