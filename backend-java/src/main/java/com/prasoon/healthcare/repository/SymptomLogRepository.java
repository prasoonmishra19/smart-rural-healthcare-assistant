package com.prasoon.healthcare.repository;

import com.prasoon.healthcare.entity.SymptomLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SymptomLogRepository extends JpaRepository<SymptomLog, Long> {
}