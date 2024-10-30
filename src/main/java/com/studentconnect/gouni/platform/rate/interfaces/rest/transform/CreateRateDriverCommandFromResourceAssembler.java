package com.studentconnect.gouni.platform.rate.interfaces.rest.transform;


import com.studentconnect.gouni.platform.rate.domain.model.commands.CreateRateDriverCommand;
import com.studentconnect.gouni.platform.rate.interfaces.rest.resources.CreateRateDriverResource;

public class CreateRateDriverCommandFromResourceAssembler {

    public static CreateRateDriverCommand toCommand(CreateRateDriverResource resource) {
        return new CreateRateDriverCommand(resource.punctuality(), resource.score(),
                resource.comfortTravel(), resource.courtesyProfessionalism(), resource.knowledgeRoute(),
                resource.safeDriving());
    }
}
