package com.studentconnect.gouni.platform.profiles.interfaces.rest.transform;

import org.springframework.stereotype.Component;
import unirider.platform.profiles.domain.model.entities.Review;
import unirider.platform.profiles.interfaces.rest.resources.ReviewResource;

@Component
public class ReviewResourceFromEntityAssembler {

        public ReviewResource toResourceFromEntity(Review review) {
            return new ReviewResource(
                    review.getId(),
                    review.getDriver().getId(),
                    review.getPassenger().getId(),
                    review.getRating(),
                    review.getComments()
            );
        }
}
