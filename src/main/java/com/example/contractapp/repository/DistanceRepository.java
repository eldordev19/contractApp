package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Distance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DistanceRepository extends JpaRepository<Distance, UUID> {
}
