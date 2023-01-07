package com.example.contractapp.repository;

import com.example.contractapp.model.entity.StatusConsumer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusConsumerRepository extends JpaRepository<StatusConsumer, UUID> {
}
