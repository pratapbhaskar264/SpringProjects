package com.bhaskar.Hospital_Management.Repository;

import com.bhaskar.Hospital_Management.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository<Appointment> extends JpaRepository<Appointment , Long> {
}
