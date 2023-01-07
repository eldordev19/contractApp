package com.example.contractapp.repository;

import com.example.contractapp.model.entity.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, UUID> {

}
