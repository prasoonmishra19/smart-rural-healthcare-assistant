
# Database Design

## Overview

The Smart Rural Healthcare Assistant stores patient information, symptom history, medicine reminders, hospital information, and AI-generated assessments.

## Tables

### 1. Patients

Stores basic patient information.

| Column | Type | Description |
|----------|----------|----------|
| patient_id | BIGINT | Primary Key |
| full_name | VARCHAR(100) | Patient Name |
| age | INT | Patient Age |
| gender | VARCHAR(10) | Gender |
| phone_number | VARCHAR(15) | Contact Number |
| village | VARCHAR(100) | Village Name |
| created_at | TIMESTAMP | Registration Time |

### 2. Symptom_Logs

Stores symptoms submitted by patients.

### 3. AI_Assessments

Stores AI-generated recommendations and severity analysis.

### 4. Medicine_Reminders

Stores medicine schedules and reminder times.

### 5. Hospitals

Stores nearby hospital information.

## Database Relationships


```text
patients
    |
    +------ symptom_logs
    |
    +------ medicine_reminders
    |
    +------ ai_assessments

hospitals
```