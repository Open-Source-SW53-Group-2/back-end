package com.studentconnect.gouni.platform.profiles.domain.services;

import com.studentconnect.gouni.platform.profiles.domain.model.aggregates.Profile;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetAllProfilesQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetProfileByEmailQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetProfileByIdQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileQueryServiceImpl implements ProfileQueryService {

    @Override
    public Optional<Profile> handle(GetProfileByEmailQuery query) {
        // Lógica para manejar la consulta de perfil por email
        return Optional.empty();  // Ajusta esta parte con la lógica real
    }

    @Override
    public Optional<Profile> handle(GetProfileByIdQuery query) {
        // Lógica para manejar la consulta de perfil por ID
        return Optional.empty();  // Ajusta esta parte con la lógica real
    }

    @Override
    public List<Profile> handle(GetAllProfilesQuery query) {
        // Lógica para manejar la consulta de todos los perfiles
        return List.of();  // Ajusta esta parte con la lógica real
    }
}