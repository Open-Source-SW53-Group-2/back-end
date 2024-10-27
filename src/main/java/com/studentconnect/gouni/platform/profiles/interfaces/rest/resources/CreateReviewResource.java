package com.studentconnect.gouni.platform.profiles.interfaces.rest.resources;

public record CreateReviewResource(
        Long driverId,
        Long passengerId,
        int rating,
        String comments
) {
}
