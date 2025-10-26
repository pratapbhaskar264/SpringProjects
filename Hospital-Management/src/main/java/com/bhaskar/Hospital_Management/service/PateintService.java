package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PateintService {

    public List<Patient> getAllPatients(){
        try{
            System.out.println("SERVICE");
            return new ArrayList<>();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("error");
            return new ArrayList<>();
        }
    }
    public Patient getPatientById(Long id){
        try{
            System.out.println("SERVICE");
            return new Patient();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("error");
            return new Patient();
        }
    }

    public Patient createPateint(Patient patient) {
        return null;
    }

    public void deletePateintById(Long id) {
    }
}
