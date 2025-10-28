package com.bhaskar.Hospital_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository<Doctor> extends JpaRepository<Doctor ,Long> {
}
