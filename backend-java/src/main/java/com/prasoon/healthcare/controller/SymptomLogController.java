package com.prasoon.healthcare.controller;

import com.prasoon.healthcare.entity.SymptomLog;
import com.prasoon.healthcare.repository.SymptomLogRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/symptoms")
public class SymptomLogController {

    private final SymptomLogRepository symptomLogRepository;

    public SymptomLogController(SymptomLogRepository symptomLogRepository) {
        this.symptomLogRepository = symptomLogRepository;
    }

    @GetMapping
    public List<SymptomLog> getAllSymptoms() {
        return symptomLogRepository.findAll();
    }

    @PostMapping
    public SymptomLog saveSymptoms(@RequestBody SymptomLog symptomLog) {
        return symptomLogRepository.save(symptomLog);
    }
}