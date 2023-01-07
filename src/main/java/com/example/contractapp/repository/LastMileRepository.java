package com.example.contractapp.repository;

import com.example.contractapp.model.entity.LastMile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LastMileRepository extends JpaRepository<LastMile, UUID> {
}
