package com.prasoon.healthcare.controller;

import com.prasoon.healthcare.entity.HealthRecommendation;
import com.prasoon.healthcare.entity.SymptomLog;
import com.prasoon.healthcare.repository.SymptomLogRepository;
import com.prasoon.healthcare.service.RecommendationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final RecommendationService recommendationService;
    private final SymptomLogRepository symptomLogRepository;

    public RecommendationController(
            RecommendationService recommendationService,
            SymptomLogRepository symptomLogRepository) {

        this.recommendationService = recommendationService;
        this.symptomLogRepository = symptomLogRepository;
    }

    @PostMapping("/{symptomId}")
    public HealthRecommendation generateRecommendation(
            @PathVariable Long symptomId) {

        SymptomLog symptomLog =
                symptomLogRepository.findById(symptomId)
                        .orElseThrow(() ->
                                new RuntimeException("Symptom log not found"));

        return recommendationService.generateRecommendation(symptomLog);
    }
}