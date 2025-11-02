package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Patient;
import com.bhaskar.Hospital_Management.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/patients")
public class Patientcontroller {

 @Autowired
 private PatientService patientService;

    @GetMapping
    public Page<Patient> getAllPatients(@RequestParam(defaultValue = "0") int page ,
                                        @RequestParam(defaultValue = "2") int size ){

        return patientService.getAllPatients(page , size);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return  patientService.createPatient(patient) ;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id ){

        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id ){
            patientService.deletePatientById(id);
    }

    @PutMapping("/{id}")
    public void updatePatient(@RequestBody Patient patient , @PathVariable Long id  ) {
          patientService.updatePatient(id ,patient  );
    }
}
