package com.example.contractapp.repository;

import com.example.contractapp.model.entity.PayType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PayTypeRepository extends JpaRepository<PayType, UUID> {
}
