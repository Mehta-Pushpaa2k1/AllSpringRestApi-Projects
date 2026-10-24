package com.jsp.customerapi.dto;


import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRegisterDto {

    @NotBlank(message = "Name is required")
    @Size(min = 5, max = 15,
            message = "Name must contain 5 to 15 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Enter a valid email")
    private String email;

    @NotBlank(message = "City is required")
    private String city;

    @Min(value = 1, message = "Age must be greater than zero")
    private int age;
}