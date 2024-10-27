package com.studentconnect.gouni.platform.iam.application.internal.outboundservices.tokens;

import org.springframework.stereotype.Service;


@Service
public interface TokenService {
    String generateToken(String username);
    String getUsernameFromToken(String token);
    boolean validateToken(String token);
}
