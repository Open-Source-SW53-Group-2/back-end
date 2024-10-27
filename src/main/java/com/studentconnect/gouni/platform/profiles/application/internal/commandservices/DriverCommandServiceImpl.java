package com.studentconnect.gouni.platform.profiles.application.internal.commandservices;

import com.studentconnect.gouni.platform.profiles.domain.model.aggregates.Driver;
import com.studentconnect.gouni.platform.profiles.domain.model.commands.CreateDriverCommand;
import com.studentconnect.gouni.platform.profiles.domain.model.commands.CreateDriverImageCommand;
import com.studentconnect.gouni.platform.profiles.domain.model.commands.UpdateDriverCommand;
import com.studentconnect.gouni.platform.profiles.domain.model.valueobjects.DriverLicense;
import com.studentconnect.gouni.platform.profiles.domain.model.valueobjects.DriverPhone;
import com.studentconnect.gouni.platform.profiles.domain.services.DriverCommandService;
import com.studentconnect.gouni.platform.profiles.infrastructure.persistence.jpa.repositories.DriverImageRepository;
import com.studentconnect.gouni.platform.profiles.infrastructure.persistence.jpa.repositories.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverCommandServiceImpl implements DriverCommandService {

    private final DriverRepository driverRepository;
    private final DriverImageRepository driverImageRepository;

    public DriverCommandServiceImpl(DriverRepository driverRepository, DriverImageRepository driverImageRepository) {
        this.driverRepository = driverRepository;
        this.driverImageRepository = driverImageRepository;
    }

    @Override
    public Long handle(CreateDriverCommand command) {
        // Validate that the vet center has a unique License
        var license = new DriverLicense(command.license());

        driverRepository.findDriverByDriverLicense(license)
                .map(driver -> {
                    throw new IllegalArgumentException("Driver already exists with License "
                            + license.driverLicense() + "");
                });

        // Create a new driver and save it
        var driver = new Driver(
                command.name(),
                command.email(),
                command.license(),
                command.phone(),
                command.imageProfile(),
                command.description()
        );

        driverRepository.save(driver);
        return driver.getId();
    }

    @Override
    public Long handle(UpdateDriverCommand command) {
        var driver = driverRepository.findById(command.id()).orElseThrow(() -> new IllegalArgumentException("Driver with id " + command.id() + " does not exist"));

        // si el nombre es diferente de null, de "string" y no esta vacio, actualiza el nombre
        if (command.name() != null && !command.name().equals("string") && !command.name().isEmpty()) {
            driver.setName(command.name());
        }

        // si el email es diferente de null, de "string" y no esta vacio, actualiza el email
        if (command.email() != null && !command.email().equals("string") && !command.email().isEmpty()) {
            driver.setEmail(command.email());
        }

        // si el telefono es diferente de null, de "string" y no esta vacio, actualiza el telefono
        if (command.phone() != null && command.phone() != 0) {
            driver.setDriverPhone(new DriverPhone(command.phone()));
        }

//        // si la descripcion es diferente de null, de "string" y no esta vacio, actualiza la descripcion
//        if (command.description() != null && !command.description().equals("string") && !command.description().isEmpty()) {
//            driver.setDescription(command.description());
//        }
//
//        // si la imagen de perfil es diferente de null, de "string" y no esta vacio, actualiza la imagen de perfil
//        if (command.imageProfile() != null && !command.imageProfile().equals("string") && !command.imageProfile().isEmpty()) {
//            driver.setImageProfile(command.imageProfile());
//        }

        driverRepository.save(driver);
        return driver.getId();
    }

    @Override
    public Long handle (CreateDriverImageCommand command) {
        var driverOpt = driverRepository.findById(command.driverId());

        if (driverOpt.isPresent()) {
            var driver = driverOpt.get();
            driver.addImage(command.imageUrl());
            driverRepository.save(driver);
            return driver.getId();
        }
        else {
            throw new IllegalArgumentException("Driver with id " + command.driverId() + " does not exist");
        }
    }
}
