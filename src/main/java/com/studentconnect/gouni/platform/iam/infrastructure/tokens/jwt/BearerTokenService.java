package com.studentconnect.gouni.platform.iam.infrastructure.tokens.jwt;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;

public interface BearerTokenService {

    /**
     * Generates a JWT token based on the authentication.
     *
     * @param authentication The user's authentication object.
     * @return A JWT token.
     */
    String generateToken(Authentication authentication);

    /**
     * Extracts the username from the token.
     *
     * @param token The JWT token.
     * @return The username from the token.
     */
    String getUsernameFromToken(String token);

    /**
     * Validates the token to ensure it's well-formed, signed, and not expired.
     *
     * @param token The JWT token to validate.
     * @return True if the token is valid, false otherwise.
     */
    boolean validateToken(String token);

    /**
     * Extracts the bearer token from the HTTP request.
     *
     * @param request The HTTP request.
     * @return The bearer token, or null if not present.
     */
    String getBearerTokenFrom(HttpServletRequest request);
}