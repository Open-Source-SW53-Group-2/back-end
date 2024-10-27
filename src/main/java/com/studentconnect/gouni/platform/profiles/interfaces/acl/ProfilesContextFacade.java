package com.studentconnect.gouni.platform.profiles.interfaces.acl;

import com.studentconnect.gouni.platform.profiles.domain.model.commands.CreateProfileCommand;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetDriverByIdQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetPassengerByIdQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.queries.GetProfileByEmailQuery;
import com.studentconnect.gouni.platform.profiles.domain.model.valueobjects.EmailAddress;
import com.studentconnect.gouni.platform.profiles.domain.services.*;
import org.springframework.stereotype.Component;

@Component
public class ProfilesContextFacade {

    private final ProfileCommandService profileCommandService;
    private final ProfileQueryService profileQueryService;
    private final DriverCommandService driverCommandService;
    private final DriverQueryService driverQueryService;
    private final PassengerCommandService passengerCommandService;
    private final PassengerQueryService passengerQueryService;

    public ProfilesContextFacade(ProfileCommandService profileCommandService, ProfileQueryService profileQueryService, DriverCommandService driverCommandService, DriverQueryService driverQueryService, PassengerCommandService passengerCommandService, PassengerQueryService passengerQueryService) {
        this.profileCommandService = profileCommandService;
        this.profileQueryService = profileQueryService;
        this.driverCommandService = driverCommandService;
        this.driverQueryService = driverQueryService;
        this.passengerCommandService = passengerCommandService;
        this.passengerQueryService = passengerQueryService;
    }

    public Long createProfile(String firstName, String lastName, String email, String street, String number, String city, String state, String zipCode) {
        var createProfileCommand = new CreateProfileCommand(firstName, lastName, email, street, number, city, state, zipCode);
        var profile = profileCommandService.handle(createProfileCommand);
        if (profile.isEmpty()) {
            throw new IllegalArgumentException("Profile with email " + email + " already exists");
        }
        return profile.get().getId();
    }

    public Long fetchProfileIdByEmail(String email) {
        var getProfileByEmailQuery = new GetProfileByEmailQuery(new EmailAddress(email));
        var profile = profileQueryService.handle(getProfileByEmailQuery);
        if (profile.isEmpty()) return 0L;
        return profile.get().getId();

    }
    public Long fetchPassengerIdById(Long passengerId){
        var getPassengerByIdQuery = new GetPassengerByIdQuery(passengerId);
        var passenger = passengerQueryService.handle(getPassengerByIdQuery);
        if (passenger.isEmpty()) return 0L;
        return passenger.get().getId();
    }

    public Long fetchDriverIdById(Long driverId){
        var getDriverByIdQuery = new GetDriverByIdQuery(driverId);
        var driver = driverQueryService.handle(getDriverByIdQuery);
        if (driver.isEmpty()) return 0L;
        return driver.get().getId();
    }
}
