package com.bhaskar.Hospital_Management.controllers;

import com.bhaskar.Hospital_Management.models.Bill;
import com.bhaskar.Hospital_Management.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
@CrossOrigin(origins = "*")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public Page<Bill> getAllBills(@RequestParam(defaultValue = "0") int page ,
                                  @RequestParam(defaultValue = "2") int size) {
        return billService.getAllBills(page , size);
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        return billService.createBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        return billService.getBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBillById(@PathVariable Long id) {
        billService.deleteBillById(id);
    }

    @PutMapping("/{id}")
    public void updateBill(@RequestBody Bill bill , @PathVariable Long id) {
        billService.updateBill(bill , id);
    }
}
