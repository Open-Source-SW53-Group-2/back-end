package com.studentconnect.gouni.platform.rate.interfaces.rest.transform;

import com.studentconnect.gouni.platform.rate.domain.model.aggregates.RateDriver;
import com.studentconnect.gouni.platform.rate.interfaces.rest.resources.RateDriverResource;

public class RateDriverResourceFromEntityAssembler {

    public static RateDriverResource toResourceFromEntity(RateDriver entity) {
        return new RateDriverResource(entity.getId(), entity.getPunctuality(),entity.getScore(),
                entity.getComfortTravel(), entity.getCourtesyProfessionalism(), entity.getKnowledgeRoute(),
                entity.getSafeDriving());
    }
}
