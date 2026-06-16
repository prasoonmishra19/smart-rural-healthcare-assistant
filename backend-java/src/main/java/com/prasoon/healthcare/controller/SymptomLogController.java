package com.prasoon.healthcare.controller;

import com.prasoon.healthcare.entity.SymptomLog;
import com.prasoon.healthcare.service.SymptomAnalysisService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/symptoms")
public class SymptomLogController {

    private final SymptomAnalysisService symptomAnalysisService;

    public SymptomLogController(SymptomAnalysisService symptomAnalysisService) {
        this.symptomAnalysisService = symptomAnalysisService;
    }

    @GetMapping
    public List<SymptomLog> getAllSymptoms() {
        return symptomAnalysisService.getAllSymptoms();
    }

    @PostMapping
    public SymptomLog saveSymptoms(@RequestBody SymptomLog symptomLog) {
        return symptomAnalysisService.saveSymptoms(symptomLog);
    }
}