package com.bhaskar.Hospital_Management.Repository;

import com.bhaskar.Hospital_Management.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
