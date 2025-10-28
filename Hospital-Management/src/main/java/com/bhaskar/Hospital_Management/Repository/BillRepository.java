package com.bhaskar.Hospital_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository<Bill> extends JpaRepository<Bill,Long> {
}
