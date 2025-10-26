package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return new ArrayList<>();
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("woohhho... mil gaya appointment");
        return new Appointment();
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        System.out.println("Fetched appointment with id: " + id);
        return new Appointment();
    }

    @DeleteMapping("/{id}")
    public void deleteAppointmentById(@PathVariable Long id) {
        System.out.println("Deleted appointment with id: " + id);
    }

    @PutMapping
    public void updateAppointment(@RequestBody Appointment appointment) {
        System.out.println("Appointment updated successfully!");
    }
}
