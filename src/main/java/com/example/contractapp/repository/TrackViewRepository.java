package com.example.contractapp.repository;

import com.example.contractapp.model.entity.TrackView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrackViewRepository extends JpaRepository<TrackView, UUID> {
}
