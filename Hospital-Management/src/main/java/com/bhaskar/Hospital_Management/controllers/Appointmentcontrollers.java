package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Doctor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PatchExchange;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class Appointmentcontrollers {



    @GetMapping
    public List<Doctor> getAllPatients(){
        return new ArrayList<>();
    }

    @PostMapping
    public Doctor createPatient(@RequestBody Doctor doctor) {
        System.out.println("woohhho...doctorBngya");
        return new Doctor();
    }

    @GetMapping("/{id}")
    public Doctor getPatientById(@PathVariable Long id ){
        System.out.println("leli id");
        return new Doctor();
    }

    @GetMapping("/{id}")
    public void deletePatientById(@PathVariable Long id ){
        System.out.println("mrgyi id");
    }

    @PutMapping
    public void updatePatient(@RequestBody Doctor doctor ) {

    }
}
