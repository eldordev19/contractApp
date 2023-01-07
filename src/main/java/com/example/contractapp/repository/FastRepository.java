package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Fast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FastRepository extends JpaRepository<Fast, UUID> {
}
