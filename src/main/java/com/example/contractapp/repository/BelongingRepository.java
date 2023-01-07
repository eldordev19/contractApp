package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Belonging;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BelongingRepository extends JpaRepository<Belonging, UUID> {
}
