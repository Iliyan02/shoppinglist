package com.softuni.demo.models.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterBindingModel {
    @NotEmpty
    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters")
    private String username;
    @Email
    private String email;
    @NotEmpty
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters")
    private String password;
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters")
    private String confirmPassword;

}
