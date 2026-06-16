class SymptomAnalyzer:

    @staticmethod
    def analyze(symptoms: str):

        symptoms = symptoms.lower()

        if "chest pain" in symptoms:
            return {
                "riskLevel": "HIGH",
                "recommendation":
                    "Immediate medical attention recommended.",
                "referral":
                    "Consult a doctor immediately."
            }

        if "difficulty breathing" in symptoms:
            return {
                "riskLevel": "CRITICAL",
                "recommendation":
                    "Visit nearest healthcare center immediately.",
                "referral":
                    "Emergency medical care required."
            }

        if "fever" in symptoms and "cough" in symptoms:
            return {
                "riskLevel": "MEDIUM",
                "recommendation":
                    "Stay hydrated and monitor symptoms.",
                "referral":
                    "Visit Primary Health Center within 48 hours."
            }

        return {
            "riskLevel": "LOW",
            "recommendation":
                "Rest and monitor symptoms.",
            "referral":
                "Home care recommended."
        }