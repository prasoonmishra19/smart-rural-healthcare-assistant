package com.prasoon.healthcare.service;

import com.prasoon.healthcare.dto.AiResponse;
import com.prasoon.healthcare.entity.HealthRecommendation;
import com.prasoon.healthcare.entity.SymptomLog;
import com.prasoon.healthcare.repository.HealthRecommendationRepository;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    private final HealthRecommendationRepository recommendationRepository;
    private final AiServiceClient aiServiceClient;

    public RecommendationService(
            HealthRecommendationRepository recommendationRepository,
            AiServiceClient aiServiceClient) {

        this.recommendationRepository = recommendationRepository;
        this.aiServiceClient = aiServiceClient;
    }

    public HealthRecommendation generateRecommendation(
            SymptomLog symptomLog) {

        AiResponse aiResponse =
                aiServiceClient.analyzeSymptoms(
                        symptomLog.getSymptoms()
                );

        HealthRecommendation result =
                new HealthRecommendation();

        result.setPatientId(symptomLog.getPatientId());
        result.setSymptomLogId(symptomLog.getSymptomId());

        result.setRiskLevel(
                aiResponse.getRiskLevel()
        );

        result.setRecommendationText(
                aiResponse.getRecommendation()
        );

        result.setReferral(
                aiResponse.getReferral()
        );

        return recommendationRepository.save(result);
    }
}