package com.example.contractapp.repository;

import com.example.contractapp.model.entity.OrganizationalAndLegalActivities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrganizationalLegalActivitiesRepository extends JpaRepository<OrganizationalAndLegalActivities, UUID> {
}
