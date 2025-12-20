package com.codingshuttle.projects.lovable_clone.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(
    @Email @NotBlank String email, 
    @NotBlank @Size(min=4, max = 15) String password) {

}
