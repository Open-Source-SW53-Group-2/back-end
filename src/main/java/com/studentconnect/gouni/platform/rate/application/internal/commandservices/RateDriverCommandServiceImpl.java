package com.studentconnect.gouni.platform.rate.application.internal.commandservices;

import com.studentconnect.gouni.platform.rate.domain.model.aggregates.RateDriver;
import com.studentconnect.gouni.platform.rate.domain.model.commands.CreateRateDriverCommand;
import com.studentconnect.gouni.platform.rate.domain.services.RateDriverCommandService;
import com.studentconnect.gouni.platform.rate.infrastructure.persistence.jpa.RateDriverRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RateDriverCommandServiceImpl implements RateDriverCommandService {

    private final RateDriverRepository rateDriverRepository;

    public RateDriverCommandServiceImpl(RateDriverRepository rateDriverRepository) {
        this.rateDriverRepository = rateDriverRepository;
    }

    @Override
    public Optional<RateDriver> handle(CreateRateDriverCommand command) {

        var rateDriver = new RateDriver(command);
        var createRateDriver = rateDriverRepository.save(rateDriver);
        return Optional.of(createRateDriver);
    }


}
