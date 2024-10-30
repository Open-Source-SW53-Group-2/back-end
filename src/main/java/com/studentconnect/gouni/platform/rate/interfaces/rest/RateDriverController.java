package com.studentconnect.gouni.platform.rate.interfaces.rest;

import com.studentconnect.gouni.platform.rate.domain.model.aggregates.RateDriver;
import com.studentconnect.gouni.platform.rate.domain.services.RateDriverCommandService;
import com.studentconnect.gouni.platform.rate.infrastructure.persistence.jpa.RateDriverRepository;
import com.studentconnect.gouni.platform.rate.interfaces.rest.resources.CreateRateDriverResource;
import com.studentconnect.gouni.platform.rate.interfaces.rest.resources.RateDriverResource;
import com.studentconnect.gouni.platform.rate.interfaces.rest.transform.CreateRateDriverCommandFromResourceAssembler;
import com.studentconnect.gouni.platform.rate.interfaces.rest.transform.RateDriverResourceFromEntityAssembler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/rate-drivers", produces = APPLICATION_JSON_VALUE)
@Tag(name = "Rate Drivers", description = "Operations related to rate drivers")

public class RateDriverController {

    private final RateDriverCommandService rateDriverCommandService;

    public RateDriverController(RateDriverCommandService rateDriverCommandService) {
        this.rateDriverCommandService = rateDriverCommandService;
    }
    @Operation(
            summary = "Create a rate driver",
            description = "Create a rate driver with the provided the content "
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Rate driver created"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
    })

    @PostMapping
    public ResponseEntity<RateDriverResource> createRateDriver(@RequestBody CreateRateDriverResource resource) {
        Optional<RateDriver> rateDriver = rateDriverCommandService
                .handle(CreateRateDriverCommandFromResourceAssembler.toCommand(resource));
        return rateDriver.map(source -> new ResponseEntity(RateDriverResourceFromEntityAssembler.toResourceFromEntity(source), CREATED))
                .orElseGet(() -> ResponseEntity.badRequest().build());

    }


}