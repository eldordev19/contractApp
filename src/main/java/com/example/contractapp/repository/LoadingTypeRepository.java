package com.example.contractapp.repository;

import com.example.contractapp.model.LoadingType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LoadingTypeRepository extends JpaRepository<LoadingType, UUID> {
}
