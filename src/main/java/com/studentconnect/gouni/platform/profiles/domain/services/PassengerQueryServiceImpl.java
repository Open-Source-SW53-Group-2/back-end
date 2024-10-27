package com.studentconnect.gouni.platform.profiles.domain.services;

import com.studentconnect.gouni.platform.profiles.domain.model.aggregates.Passenger;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetAllPassengersQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetPassengerByIdQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerQueryServiceImpl implements PassengerQueryService {

    @Override
    public Optional<Passenger> handle(GetPassengerByIdQuery query) {
        // Aquí agregas la lógica para buscar un pasajero por su ID
        return Optional.empty(); // Cambia esta línea por la lógica real
    }

    @Override
    public List<Passenger> handle(GetAllPassengersQuery query) {
        // Aquí agregas la lógica para obtener la lista de todos los pasajeros
        return List.of(); // Cambia esta línea por la lógica real
    }
}