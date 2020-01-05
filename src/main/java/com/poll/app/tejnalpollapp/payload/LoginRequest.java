package com.poll.app.tejnalpollapp.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
public class LoginRequest {

    @NotBlank
    private String  usernameOrEmail;

    @NotBlank
    private String password;





}
