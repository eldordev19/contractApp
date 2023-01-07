package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Uzel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UzelRepository extends JpaRepository<Uzel, UUID> {
}
