package com.simplon.repository;

import com.simplon.entities.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository extends IGenericRepository<Patient,Integer> {
}

