package com.example.contractapp.repository;

import com.example.contractapp.model.entity.SignalType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SignalTypeRepository extends JpaRepository<SignalType, UUID> {
}
