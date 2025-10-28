package com.bhaskar.Hospital_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository<Doctor> extends JpaRepository<Doctor ,Long> {
}
