package com.example.contractapp.repository;

import com.example.contractapp.model.entity.Share;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShareRepository extends JpaRepository<Share, UUID> {
}
