package com.studentconnect.gouni.platform.profiles.domain.services;

import com.studentconnect.gouni.platform.profiles.domain.model.entities.Review;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetAllReviewByDriverIdQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewQueryServiceImpl implements ReviewQueryService {

    @Override
    public List<Review> handle(GetAllReviewByDriverIdQuery query) {
        // Lógica para manejar la consulta de reseñas por driverId
        return List.of();  // Ajusta esta lógica con la implementación real
    }
}