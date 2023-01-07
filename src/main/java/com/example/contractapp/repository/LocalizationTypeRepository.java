package com.example.contractapp.repository;

import com.example.contractapp.model.entity.LocalizationType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocalizationTypeRepository extends JpaRepository<LocalizationType, UUID> {
}
