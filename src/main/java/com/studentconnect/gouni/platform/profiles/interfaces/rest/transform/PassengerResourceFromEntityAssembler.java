package com.studentconnect.gouni.platform.profiles.interfaces.rest.transform;

import com.studentconnect.gouni.platform.profiles.domain.model.aggregates.Passenger;
import com.studentconnect.gouni.platform.profiles.interfaces.rest.resources.PassengerResource;

public class PassengerResourceFromEntityAssembler {

    public static PassengerResource toResourceFromEntity(Passenger entity) {
        return new PassengerResource(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getDNI(),
                entity.getPhone(),
                entity.getPhoto()
        );
    }
}
