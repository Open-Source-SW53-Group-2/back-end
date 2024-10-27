package com.studentconnect.gouni.platform.profiles.interfaces.rest.transform;

import com.studentconnect.gouni.platform.profiles.domain.model.aggregates.Driver;
import com.studentconnect.gouni.platform.profiles.interfaces.rest.resources.DriverResource;

public class DriverResourceFromEntityAssembler {

    public static DriverResource toResourceFromEntity(Driver entity) {
        return new DriverResource(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getLicense(),
                entity.getPhone(),
                entity.getDriverImageProfile(),
                entity.getDriverDescription()
        );
    }
}
