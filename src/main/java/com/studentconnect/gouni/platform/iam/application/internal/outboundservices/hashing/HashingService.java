package com.studentconnect.gouni.platform.iam.application.internal.outboundservices.hashing;

import org.springframework.stereotype.Service;

@Service
public interface HashingService {
    String encode(CharSequence rawPassword);

    boolean matches(CharSequence rawPassword, String encodedPassword);
}