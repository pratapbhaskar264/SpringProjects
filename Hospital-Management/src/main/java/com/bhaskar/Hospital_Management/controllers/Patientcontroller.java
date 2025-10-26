package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class Patientcontroller {



    @GetMapping
    public List<Patient> getAllPatients(){
        return new ArrayList<>();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("woohhho...mreejBngya");
        return new Patient();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id ){
        System.out.println("leli id");
        return new Patient();
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id ){
        System.out.println("mrgyi id");
    }

    @PutMapping
    public void updatePatient(@RequestBody Patient patient  ) {

    }
}
