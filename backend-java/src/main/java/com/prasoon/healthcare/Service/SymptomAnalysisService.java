package com.prasoon.healthcare.service;

import com.prasoon.healthcare.entity.SymptomLog;
import com.prasoon.healthcare.repository.SymptomLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomAnalysisService {

    private final SymptomLogRepository symptomLogRepository;

    public SymptomAnalysisService(SymptomLogRepository symptomLogRepository) {
        this.symptomLogRepository = symptomLogRepository;
    }

    public List<SymptomLog> getAllSymptoms() {
        return symptomLogRepository.findAll();
    }

    public SymptomLog saveSymptoms(SymptomLog symptomLog) {
        return symptomLogRepository.save(symptomLog);
    }
}