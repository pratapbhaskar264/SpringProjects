package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return new ArrayList<>();
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Doctor created successfully!");
        return new Doctor();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Fetched doctor with id: " + id);
        return new Doctor();
    }

    @DeleteMapping("/{id}")
    public void deleteDoctorById(@PathVariable Long id) {
        System.out.println("Deleted doctor with id: " + id);
    }

    @PutMapping
    public void updateDoctor(@RequestBody Doctor doctor) {
        System.out.println("Doctor updated successfully!");
    }
}
