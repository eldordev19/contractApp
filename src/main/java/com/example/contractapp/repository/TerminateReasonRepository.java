package com.example.contractapp.repository;

import com.example.contractapp.model.entity.TerminateReason;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TerminateReasonRepository extends JpaRepository<TerminateReason, UUID> {
}
