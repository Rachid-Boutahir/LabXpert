package com.simplon.repository;

import com.simplon.entities.Sample;
import org.springframework.stereotype.Repository;

@Repository
public interface ISampleRepository extends IGenericRepository<Sample,Integer> {
}
