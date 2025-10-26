package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Patient;
import com.bhaskar.Hospital_Management.service.PateintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class Patientcontroller {

 @Autowired
 private PateintService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){
      return patientService.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return  patientService.createPateint(patient) ;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id ){

        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id ){
            patientService.deletePateintById(id);
    }

    @PutMapping
    public void updatePatient(@RequestBody Patient patient  ) {
          patientService.updatePatient(patient);
    }
}
