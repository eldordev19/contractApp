package com.example.contractapp.repository;

import com.example.contractapp.model.entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BankDetailsRepository extends JpaRepository<BankDetails, UUID> {
}
