package com.studentconnect.gouni.platform.rate.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class RateDriver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String punctuality; // A Tiempo, Regular, Tarde

    @Getter
    @Setter
    private int score; // Puntuación de estrellas (1-5)

    @Getter
    @Setter
    private String comfortTravel; // Texto del comentario sobre comodidad del viaje

    @Getter
    @Setter
    private String courtesyProfessionalism; // Texto del comentario sobre cortesía y profesionalismo

    @Getter
    @Setter
    private String knowledgeRoute; // Texto del comentario sobre conocimiento de la ruta

    @Getter
    @Setter
    private String safeDriving; // Texto del comentario sobre conducción segura

    // Constructor vacío requerido por JPA
    public RateDriver() {}

    // Constructor para inicializar los campos
    public RateDriver(String punctuality, int score, String comfortTravel,
                        String courtesyProfessionalism, String knowledgeRoute,
                        String safeDriving) {
        this.punctuality = punctuality;
        this.score = score;
        this.comfortTravel = comfortTravel;
        this.courtesyProfessionalism = courtesyProfessionalism;
        this.knowledgeRoute = knowledgeRoute;
        this.safeDriving = safeDriving;
    }

    public Long getId() {
        return id;
    }
}
