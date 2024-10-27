package com.studentconnect.gouni.platform.profiles.domain.model.valueobjects;

import jakarta.validation.constraints.Email;

import javax.persistence.Embeddable;

@Embeddable
public record EmailAddress(@Email String address) {

    public EmailAddress(){
        this(null);
    }

    public EmailAddress {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
    }


}
