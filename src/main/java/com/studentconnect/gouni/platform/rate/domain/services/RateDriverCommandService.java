package com.studentconnect.gouni.platform.rate.domain.services;

import com.studentconnect.gouni.platform.rate.domain.model.aggregates.RateDriver;
import com.studentconnect.gouni.platform.rate.domain.model.commands.CreateRateDriverCommand;

import java.util.Optional;

public interface RateDriverCommandService {
    Optional<RateDriver> handle(CreateRateDriverCommand command);
}
