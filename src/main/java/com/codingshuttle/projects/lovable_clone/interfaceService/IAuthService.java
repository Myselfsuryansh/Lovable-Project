package com.codingshuttle.projects.lovable_clone.interfaceService;

import com.codingshuttle.projects.lovable_clone.dto.auth.AuthResponse;
import com.codingshuttle.projects.lovable_clone.dto.auth.LoginRequest;
import com.codingshuttle.projects.lovable_clone.dto.auth.SignUpRequest;

public interface IAuthService {

    AuthResponse signup(SignUpRequest request);

    AuthResponse login(LoginRequest request);

}
