package com.studentconnect.gouni.platform.iam.application.internal.outboundservices.tokens;

import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Override
    public String generateToken(String username) {
        // Lógica para generar el token
        return "generated-token"; // Aquí va tu lógica real de JWT
    }

    @Override
    public boolean validateToken(String token) {
        // Lógica para validar el token
        return true;  // Aquí va tu lógica real de validación de JWT
    }

    @Override
    public String getUsernameFromToken(String token) {
        // Lógica para extraer el nombre de usuario del token
        return "username";  // Aquí va la extracción real del nombre de usuario desde el token
    }
}