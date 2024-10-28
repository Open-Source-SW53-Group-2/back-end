package com.studentconnect.gouni.platform.rate.domain.model.queries;

public record GetRateDriverByIdQuery(Long id) {
    public GetRateDriverByIdQuery {
        if (id == null) {
            throw new IllegalArgumentException("ID must not be null");
        }
    }
}
