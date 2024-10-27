package com.studentconnect.gouni.platform.profiles.domain.services;

import com.studentconnect.gouni.platform.profiles.domain.model.commands.CreatePassengerCommand;
import com.studentconnect.gouni.platform.profiles.domain.model.commands.UpdatePassengerCommand;
import org.springframework.stereotype.Service;

@Service
public interface PassengerCommandService {
    Long handle(CreatePassengerCommand command);
    Long handle(UpdatePassengerCommand command);
}
