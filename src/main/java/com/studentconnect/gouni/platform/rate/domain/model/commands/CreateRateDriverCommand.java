package com.studentconnect.gouni.platform.rate.domain.model.commands;


public record CreateRateDriverCommand(String punctuality, int score, String comfortTravel,
        String courtesyProfessionalism, String knowledgeRoute,
String safeDriving
)
{
}
