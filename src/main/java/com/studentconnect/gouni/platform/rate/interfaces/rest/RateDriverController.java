package com.studentconnect.gouni.platform.rate.interfaces.rest;

import com.studentconnect.gouni.platform.rate.domain.model.aggregates.RateDriver;
import com.studentconnect.gouni.platform.rate.domain.services.RateDriverCommandService;
import com.studentconnect.gouni.platform.rate.interfaces.rest.resources.CreateRateDriverResource;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rate-driver")
public class RateDriverController {

    private final RateDriverCommandService rateDriverCommandService;

    public RateDriverController(RateDriverCommandService rateDriverCommandService) {
        this.rateDriverCommandService = rateDriverCommandService;
    }

    @PostMapping
    public ResponseEntity<RateDriver> rateDriver(@Valid @RequestBody CreateRateDriverResource resource) {
        RateDriver rateDriver = rateDriverCommandService.create(resource);
        return ResponseEntity.ok(rateDriver);
    }
}