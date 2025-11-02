package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.Repository.BillRepository;
import com.bhaskar.Hospital_Management.models.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private BillRepository billRepository;

    public Page<Bill> getAllBills(int page , int size) {
        try {
            logger.info("SERVICE - getAllBills");
            Pageable pagable = PageRequest.of(page,size);
            return billRepository.findAll(pagable);
        } catch (Exception e) {
            logger.error("An error occurred while fetching all bills", e);
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            logger.info("SERVICE - getBillById: {}", id);
            Optional<Bill> bill = billRepository.findById(id);
            return bill.orElse(null);
        } catch (Exception e) {
            logger.error("An error occurred while fetching bill with ID: {}", id, e);
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            logger.info("SERVICE - createBill");
            return billRepository.save(bill);
        } catch (Exception e) {
            logger.error("An error occurred while creating a bill: {}", bill, e);
            return null;
        }
    }

    public void deleteBillById(Long id) {
        try {
            logger.info("SERVICE - deleteBillById: {}", id);
            billRepository.deleteById(id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting bill with ID: {}", id, e);
        }
    }

    // --- THIS METHOD IS NOW UPDATED ---
    public void updateBill(Bill bill, Long id) {
        try {
            logger.info("SERVICE - updateBill");
            Optional<Bill> tempBill = billRepository.findById(id);

            if(tempBill.isPresent()){
                Bill existingBill = tempBill.get();

                // Set fields from your Bill.java model
                existingBill.setPatientId(bill.getPatientId());
                existingBill.setAmount(bill.getAmount());
                existingBill.setStatus(bill.getStatus());

                billRepository.save(existingBill);
            }
            else{
                logger.error("Bill with id : {} not found " , id);
            }
        } catch (Exception e) {
            logger.error("An error occurred while updating bill: {}", bill, e);
        }
    }
}