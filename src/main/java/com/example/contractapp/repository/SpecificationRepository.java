package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpecificationRepository extends JpaRepository<Specification, UUID> {
}
