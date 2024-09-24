package com.juaracoding.dto;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 24/09/2024 16:49
@Last Modified 24/09/2024 16:49
Version 1.0
*/

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class LoginDTO {

    @NotNull(message = "tidak boleh kosong")
    @NotBlank(message = "tidak boleh kosong")
    @NotEmpty(message = "tidak boleh kosong")
    @Pattern(regexp = "^[\\w]{8,16}$", message = "Username dan password salah")
    private String username;

    @NotNull
    @NotBlank
    @NotEmpty
    private String password;

    public LoginDTO() {
        username = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

