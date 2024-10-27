package com.studentconnect.gouni.platform.profiles.domain.model.valueobjects;

import javax.persistence.Embeddable;

@Embeddable
public record PassengerName(String passengerName) {

    public PassengerName() {
        this(null);
    }

    public PassengerName {
        if (passengerName == null || passengerName.isBlank()) {
            throw new IllegalArgumentException("passenger name cannot be null or blank");
        }
    }

    public String getFullName() {
        return passengerName;
    }
}
