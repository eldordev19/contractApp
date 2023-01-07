package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Settlements;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SettlementsRepository extends JpaRepository<Settlements, UUID> {
}
