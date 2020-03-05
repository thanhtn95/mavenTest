package com.example.demomaven.model.Payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public LoginRequest(@NotBlank String username, @NotBlank String password) {
        this.username = username;
        this.password = password;
    }
}
