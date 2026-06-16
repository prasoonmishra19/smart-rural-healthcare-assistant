package com.prasoon.healthcare.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "health_recommendations")
public class HealthRecommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendationId;

    private Long patientId;

    private Long symptomLogId;

    private String riskLevel;

    @Column(length = 1000)
    private String recommendationText;

    private LocalDateTime createdAt;

    private String referral;

    public HealthRecommendation() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(Long recommendationId) {
        this.recommendationId = recommendationId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getSymptomLogId() {
        return symptomLogId;
    }

    public void setSymptomLogId(Long symptomLogId) {
        this.symptomLogId = symptomLogId;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getRecommendationText() {
        return recommendationText;
    }

    public void setRecommendationText(String recommendationText) {
        this.recommendationText = recommendationText;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }
}