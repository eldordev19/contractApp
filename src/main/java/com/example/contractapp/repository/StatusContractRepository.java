package com.example.contractapp.repository;

import com.example.contractapp.model.entity.StatusContract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusContractRepository extends JpaRepository<StatusContract, UUID> {
}
