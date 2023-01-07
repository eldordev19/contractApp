package com.example.contractapp.repository;

import com.example.contractapp.model.entity.GuidanceDocumentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuidanceDocumentTypeRepository extends JpaRepository<GuidanceDocumentType, UUID> {
}
