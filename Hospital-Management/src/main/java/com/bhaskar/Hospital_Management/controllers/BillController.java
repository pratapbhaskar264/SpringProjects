package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getAllBills() {
        return new ArrayList<>();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("Bill generated successfully!");
        return new Bill();
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Fetched bill with id: " + id);
        return new Bill();
    }

    @DeleteMapping("/{id}")
    public void deleteBillById(@PathVariable Long id) {
        System.out.println("Deleted bill with id: " + id);
    }

    @PutMapping
    public void updateBill(@RequestBody Bill bill) {
        System.out.println("Bill updated successfully!");
    }
}
