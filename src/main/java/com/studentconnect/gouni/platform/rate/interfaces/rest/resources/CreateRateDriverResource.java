package com.studentconnect.gouni.platform.rate.interfaces.rest.resources;

public record CreateRateDriverResource(String punctuality, int score, String comfortTravel,
                                       String courtesyProfessionalism, String knowledgeRoute,
                                       String safeDriving) {
}
