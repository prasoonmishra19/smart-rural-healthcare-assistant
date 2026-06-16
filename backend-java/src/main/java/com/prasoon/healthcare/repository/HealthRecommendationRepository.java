package com.prasoon.healthcare.repository;

import com.prasoon.healthcare.entity.HealthRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRecommendationRepository
        extends JpaRepository<HealthRecommendation, Long> {
}