# smart-rural-healthcare-assistant
Agentic AI-powered healthcare assistant that analyzes symptoms, manages medicine reminders, stores patient history, and 
provides healthcare recommendations using Java, Python, LangChain, and MySQL.

## Features

- Symptom Analysis
- Severity Detection
- Medicine Reminders
- Patient History Tracking
- Hospital Recommendations
- Agentic AI Workflow

## Tech Stack

### Backend
- Java
- Spring Boot

### AI Service
- Python
- LangChain
- Gemini API

### Database
- MySQL

## Architecture
```text
User
└── Requests go to...
    └── Spring Boot Backend
        ├── MySQL (Data Storage)
        └── Python AI Service
            └── Gemini API (AI Processing)
```
    
## Development Roadmap

### Phase 1
- Database Design
- Spring Boot Setup
- MySQL Integration

### Phase 2
- Python AI Service
- Symptom Analysis

### Phase 3
- Agentic Workflow
- Hospital Recommendation

### Phase 4
- Deployment & Documentation

## Author

Prasoon Mishra
