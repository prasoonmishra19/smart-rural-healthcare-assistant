package com.prasoon.healthcare.repository;

import com.prasoon.healthcare.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}