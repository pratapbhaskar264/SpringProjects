package com.bhaskar.Hospital_Management.Repository;

import com.bhaskar.Hospital_Management.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository<Appointment> extends JpaRepository<Appointment , Long> {
}
