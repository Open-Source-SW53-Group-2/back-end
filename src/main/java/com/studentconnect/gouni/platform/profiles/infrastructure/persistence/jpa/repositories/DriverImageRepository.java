package com.studentconnect.gouni.platform.profiles.infrastructure.persistence.jpa.repositories;

import com.studentconnect.gouni.platform.profiles.domain.model.entities.DriverImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverImageRepository extends JpaRepository<DriverImage, Long> {

    // Consulta para encontrar DriverImage por el driverId
    Optional<List<DriverImage>> findDriverImagesByDriverId(Long driverId);
}
