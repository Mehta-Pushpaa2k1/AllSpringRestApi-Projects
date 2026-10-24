package com.jsp.customerapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {

    private Integer id;
    private String name;
    private String email;
    private String city;
    private int age;
}