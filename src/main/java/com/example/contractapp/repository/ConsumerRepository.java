package com.example.contractapp.repository;

import com.example.contractapp.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConsumerRepository extends JpaRepository<Consumer, UUID> {
}
