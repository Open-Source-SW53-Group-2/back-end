package com.studentconnect.gouni.platform.profiles.domain.services;

import com.studentconnect.gouni.platform.profiles.domain.model.aggregates.Driver;
import com.studentconnect.gouni.platform.profiles.domain.model.entities.DriverImage;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetAllDriverImagesByDriverIdQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetAllDriversQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetDriverByIdQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetDriverByNameQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverQueryServiceImpl implements DriverQueryService {

    @Override
    public Optional<Driver> handle(GetDriverByIdQuery query) {
        // Lógica para manejar la consulta de un conductor por ID
        return Optional.empty();  // Aquí debes agregar la lógica real
    }

    @Override
    public Optional<Driver> handle(GetDriverByNameQuery query) {
        // Lógica para manejar la consulta de un conductor por nombre
        return Optional.empty();  // Aquí debes agregar la lógica real
    }

    @Override
    public List<Driver> handle(GetAllDriversQuery query) {
        // Lógica para manejar la consulta de todos los conductores
        return List.of();  // Aquí debes agregar la lógica real
    }

    @Override
    public List<DriverImage> handle(GetAllDriverImagesByDriverIdQuery query) {
        // Lógica para manejar la consulta de todas las imágenes de un conductor por su ID
        return List.of();  // Aquí debes agregar la lógica real
    }
}