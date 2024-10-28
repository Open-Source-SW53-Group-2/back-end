package com.studentconnect.gouni.platform.rate.domain.services;

import com.studentconnect.gouni.platform.rate.domain.model.aggregates.RateDriver;
import com.studentconnect.gouni.platform.rate.domain.model.queries.GetAllRateDriversQuery;
import com.studentconnect.gouni.platform.rate.domain.model.queries.GetRateDriverByIdQuery;

import java.util.Optional;

public interface RateDriverQueryService {
    Optional<RateDriver> handle(GetRateDriverByIdQuery query);
    Optional<RateDriver> handle(GetAllRateDriversQuery query);


}
