package com.prasoon.healthcare.service;

import com.prasoon.healthcare.entity.HealthRecommendation;
import com.prasoon.healthcare.entity.SymptomLog;
import com.prasoon.healthcare.repository.HealthRecommendationRepository;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    private final HealthRecommendationRepository recommendationRepository;

    public RecommendationService(
            HealthRecommendationRepository recommendationRepository) {

        this.recommendationRepository = recommendationRepository;
    }

    public HealthRecommendation generateRecommendation(
            SymptomLog symptomLog) {

        String symptoms = symptomLog.getSymptoms().toLowerCase();

        String riskLevel;
        String recommendation;

        if (symptoms.contains("chest pain")
                || symptoms.contains("difficulty breathing")) {

            riskLevel = "HIGH";

            recommendation =
                    "Immediate medical attention recommended. Visit the nearest healthcare center.";

        } else if (symptoms.contains("fever")
                && symptoms.contains("cough")) {

            riskLevel = "MEDIUM";

            recommendation =
                    "Monitor symptoms, stay hydrated, and consult a doctor if symptoms persist.";

        } else {

            riskLevel = "LOW";

            recommendation =
                    "Rest adequately and monitor symptoms for changes.";
        }

        HealthRecommendation result =
                new HealthRecommendation();

        result.setPatientId(symptomLog.getPatientId());
        result.setSymptomLogId(symptomLog.getSymptomId());
        result.setRiskLevel(riskLevel);
        result.setRecommendationText(recommendation);

        return recommendationRepository.save(result);
    }
}