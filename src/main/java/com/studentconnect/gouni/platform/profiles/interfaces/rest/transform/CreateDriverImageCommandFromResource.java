package com.studentconnect.gouni.platform.profiles.interfaces.rest.transform;

import org.springframework.stereotype.Component;
import unirider.platform.profiles.domain.model.commands.CreateDriverImageCommand;
import unirider.platform.profiles.interfaces.rest.resources.CreateDriverImageResource;

@Component
public class CreateDriverImageCommandFromResource {
    public static CreateDriverImageCommand ToCommandFromResource(Long driverId,CreateDriverImageResource resource){
        return new CreateDriverImageCommand( driverId,resource.imageUrl());
    }
}
