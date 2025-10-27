package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Bill;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills() {
        try {
            System.out.println("SERVICE - getAllBills");
            return new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in getAllBills");
            return new ArrayList<>();
        }
    }

    public Bill getBillById(Long id) {
        try {
            System.out.println("SERVICE - getBillById: " + id);
            return new Bill();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in getBillById");
            return new Bill();
        }
    }

    public Bill createBill(Bill bill) {
        try {
            System.out.println("SERVICE - createBill");
            return new Bill();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in createBill");
            return new Bill();
        }
    }

    public void deleteBillById(Long id) {
        try {
            System.out.println("SERVICE - deleteBillById: " + id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in deleteBillById");
        }
    }

    public void updateBill(Bill bill) {
        try {
            System.out.println("SERVICE - updateBill");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in updateBill");
        }
    }
}
