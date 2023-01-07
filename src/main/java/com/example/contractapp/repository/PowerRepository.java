package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Power;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PowerRepository extends JpaRepository<Power, UUID> {
}
