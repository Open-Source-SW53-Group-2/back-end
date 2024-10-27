package com.studentconnect.gouni.platform.profiles.domain.services;

import com.studentconnect.gouni.platform.profiles.domain.model.commands.CreateReviewCommand;
import com.studentconnect.gouni.platform.profiles.domain.model.entities.Review;
import org.springframework.stereotype.Service;

@Service
public class ReviewCommandServiceImpl implements ReviewCommandService {

    @Override
    public Review handle(CreateReviewCommand command) {
        // Lógica para manejar la creación de una reseña
        return new Review();  // Cambia esto con la lógica real para crear una reseña
    }
}