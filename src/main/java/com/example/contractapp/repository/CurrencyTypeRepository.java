package com.example.contractapp.repository;

import com.example.contractapp.model.entity.CurrencyType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CurrencyTypeRepository extends JpaRepository<CurrencyType, UUID> {
}
