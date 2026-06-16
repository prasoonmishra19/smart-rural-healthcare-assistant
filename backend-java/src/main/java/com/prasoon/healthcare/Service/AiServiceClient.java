package com.prasoon.healthcare.service;

import com.prasoon.healthcare.dto.AiResponse;
import com.prasoon.healthcare.dto.SymptomRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class AiServiceClient {

    private final RestClient restClient;

    public AiServiceClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public AiResponse analyzeSymptoms(String symptoms) {

        SymptomRequest request =
                new SymptomRequest(symptoms);

        return restClient.post()
                .uri("http://localhost:8000/analyze")
                .body(request)
                .retrieve()
                .body(AiResponse.class);
    }
}