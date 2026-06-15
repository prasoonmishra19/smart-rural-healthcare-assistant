--Patients Table
CREATE TABLE patients(
patient_id BIGINT PRIMARY KEY AUTO_INCREMENT,
full_name VARCHAR(100) NOT NULL,
age INT,
gender VARCHAR(10),
village VARCHAR(100),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--Symptom Logs Table
CREATE TABLE symptom_logs(
log_id BIGINT PRIMARY KEY AUTO_INCREMENT,
patient_id BITINT NOT NULL,
symptoms TEXT NOT NULL,
submitted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

FOREIGN KEY(patient_id)
REFERENCES patients(patient_id)
ON DELETE CASCADE
);

--AI Assessments Table
CREATE TABLE ai_assessments(
assessment_id BIGINT PRIMARY KEY AUTO_INCREMENT,
patient_id BIGINT NOT NULL,
log_id BIGINT NOT NULL,
severity VARCHAR(20),
recommendation TEXT,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY(patient_id) REFERENCES patients(patient_id) ON DELETE CASCADE,
FOREIGN KEY(log_id) REFERENCES symptom_logs(log_id) ON DELETE CASCADE
);

--Medicine Reminders Table
CREATE TABLE medicine_reminders(
reminder_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
patient_id BIGINT NOT NULL,
medicine_name VARCHAR(100) NOT NULL,
dosage VARCHAR(25),
reminder_time TIME,
active BOOLEAN DEFAULT TRUE,
FOREIGN KEY(patient_id) REFERENCES patients(patient_id) ON DELETE CASCADE,
);

--Hospitals Table
CREATE TABLE hospitals(
hospital_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
hospital_name VARCHAR(100) NOT NULL,
address VARCHAR(255),
district VARCHAR(150),
phone_number VARCHAR(15)
);