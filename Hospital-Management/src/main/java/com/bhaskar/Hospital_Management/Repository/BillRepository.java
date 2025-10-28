package com.bhaskar.Hospital_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository<Bill> extends JpaRepository<Bill,Long> {
}
