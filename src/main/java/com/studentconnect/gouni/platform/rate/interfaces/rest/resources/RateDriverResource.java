package com.studentconnect.gouni.platform.rate.interfaces.rest.resources;

public record RateDriverResource(Long id, String punctuality, int score, String comfortTravel,
                                 String courtesyProfessionalism, String knowledgeRoute,
                                 String safeDriving) {
}
