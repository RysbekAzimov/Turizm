package com.example.Turizm.model;

import com.example.Turizm.enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {

    private String login;
    private String password;
    private String numberPhone;
    private Role role;
}
