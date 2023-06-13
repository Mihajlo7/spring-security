package com.pokusaj.security.service;

import com.pokusaj.security.dto.AuthenticationRequest;
import com.pokusaj.security.dto.AuthenticationResponse;
import com.pokusaj.security.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    public AuthenticationResponse register(RegisterRequest request) {
        return null;
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        return null;
    }
}
