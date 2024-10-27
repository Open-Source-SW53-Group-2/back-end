package com.studentconnect.gouni.platform.profiles.domain.model.valueobjects;

import javax.persistence.Embeddable;

@Embeddable
public record PassengerDNI(Long passengerDNI) {

    public PassengerDNI{
        if (passengerDNI == null) {
            throw new IllegalArgumentException("Passenger DNI cannot be null");
        }
    }

    public Long getDNI(){
        return passengerDNI;
    }
}
