package com.bhaskar.Hospital_Management.service;

import com.bhaskar.Hospital_Management.models.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    public List<Bill> getAllBills() {
        try {
            logger.info("SERVICE - getAllBills");
            return new ArrayList<>();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all bills", e);
            return new ArrayList<>();
        }
    }

    public Bill getBillById(Long id) {
        try {
            logger.info("SERVICE - getBillById: {}", id);
            return new Bill();
        } catch (Exception e) {
            logger.error("An error occurred while fetching bill with ID: {}", id, e);
            return new Bill();
        }
    }

    public Bill createBill(Bill bill) {
        try {
            logger.info("SERVICE - createBill");
            return new Bill();
        } catch (Exception e) {
            logger.error("An error occurred while creating a bill: {}", bill, e);
            return new Bill();
        }
    }

    public void deleteBillById(Long id) {
        try {
            logger.info("SERVICE - deleteBillById: {}", id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting bill with ID: {}", id, e);
        }
    }

    public void updateBill(Bill bill) {
        try {
            logger.info("SERVICE - updateBill");
        } catch (Exception e) {
            logger.error("An error occurred while updating bill: {}", bill, e);
        }
    }
}
