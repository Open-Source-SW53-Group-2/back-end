package com.studentconnect.gouni.platform.profiles.domain.model.valueobjects;

import javax.persistence.Embeddable;

@Embeddable
public record DriverName(String driverName) {

    public DriverName() {
        this(null);
    }

    public DriverName {
        if (driverName == null || driverName.isBlank()) {
            throw new IllegalArgumentException("driver name cannot be null or blank");
        }
    }

    public String getFullName() {
        return driverName;
    }

}
