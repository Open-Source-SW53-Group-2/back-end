package com.studentconnect.gouni.platform.rate.infrastructure.persistence.jpa;

import com.studentconnect.gouni.platform.rate.domain.model.aggregates.RateDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateDriverRepository extends JpaRepository<RateDriver, Long> {

}
