package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Condition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConditionRepository extends JpaRepository<Condition, UUID> {
}
