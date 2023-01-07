package com.example.contractapp.repository;

import com.example.contractapp.model.entity.UseType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UseTypeRepository extends JpaRepository<UseType, UUID> {
}
