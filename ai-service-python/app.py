from fastapi import FastAPI
from pydantic import BaseModel

from services.symptom_analyzer import SymptomAnalyzer

app = FastAPI(
    title="Healthcare AI Service"
)


class SymptomRequest(BaseModel):
    symptoms: str


@app.get("/")
def home():
    return {
        "message": "Healthcare AI Service Running"
    }


@app.post("/analyze")
def analyze_symptoms(request: SymptomRequest):

    return SymptomAnalyzer.analyze(
        request.symptoms
    )