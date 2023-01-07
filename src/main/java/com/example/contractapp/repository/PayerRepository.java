package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Payer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PayerRepository extends JpaRepository<Payer, UUID> {
}
