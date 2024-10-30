package com.studentconnect.gouni.platform.rate.domain.model.aggregates;

import com.studentconnect.gouni.platform.rate.domain.model.commands.CreateRateDriverCommand;
import jakarta.persistence.*;
import lombok.Getter;


@Getter
public class RateDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String punctuality;

    @Column(nullable = false)
    private int score;

    @Column(nullable = false)
    private  String comfortTravel;

    @Column(nullable = false)
    private  String courtesyProfessionalism;

    @Column(nullable = false)
    private  String knowledgeRoute;

    @Column(nullable = false)
    private  String safeDriving;


    protected  RateDriver() {}


    public RateDriver(CreateRateDriverCommand command) {
        this.punctuality = command.punctuality();
        this.score = command.score();
        this.comfortTravel = command.comfortTravel();
        this.courtesyProfessionalism = command.courtesyProfessionalism();
        this.knowledgeRoute = command.knowledgeRoute();
        this.safeDriving = command.safeDriving();
    }


}
