package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Doctor;
import com.bhaskar.Hospital_Management.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public Page<Doctor> getAllDoctors(@RequestParam(defaultValue = "0") int page ,
                                      @RequestParam(defaultValue = "2") int size) {

        return doctorService.getAllDoctors(page , size);
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctorById(@PathVariable Long id) {
        doctorService.deleteDoctorById(id);
    }

    @PutMapping("/{id}")
    public void updateDoctor(@RequestBody Doctor doctor , @PathVariable Long id) {
        doctorService.updateDoctor(doctor ,id);
    }
}
