package com.bhaskar.Hospital_Management.Repository;

import com.bhaskar.Hospital_Management.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill,Long> {
}
