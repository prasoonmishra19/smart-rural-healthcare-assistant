package com.prasoon.healthcare.dto;

public class SymptomRequest {

    private String symptoms;

    public SymptomRequest() {
    }

    public SymptomRequest(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
}