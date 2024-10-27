package com.studentconnect.gouni.platform.profiles.domain.model.valueobjects;

import javax.persistence.Embeddable;

@Embeddable
public record DriverLicense(Long driverLicense) {
    public DriverLicense() {
        this(null);
    }

    public DriverLicense {
        if (driverLicense == null) {
            throw new IllegalArgumentException("Driver License cannot be null");
        }
    }
}
