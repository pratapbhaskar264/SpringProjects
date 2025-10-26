package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PatchExchange;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class Patientcontrollers {



    @GetMapping
    public List<Patient> getAllPatients(){
        return new ArrayList<>();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("woohhho...mreejBngya");
        return new Patient();
    }
}
