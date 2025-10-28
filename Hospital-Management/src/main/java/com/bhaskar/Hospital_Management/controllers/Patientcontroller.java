package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Patient;
import com.bhaskar.Hospital_Management.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/patients")
public class Patientcontroller {

 @Autowired
 private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){
      return patientService.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return  patientService.createPatient(patient) ;
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id ){

        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id ){
            patientService.deletePatientById(id);
    }

    @PutMapping
    public void updatePatient(@RequestBody Patient patient  ) {
          patientService.updatePatient(patient);
    }
}
