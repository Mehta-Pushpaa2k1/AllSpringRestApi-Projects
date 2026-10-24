package com.jsp.useer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
//
//    @PostMapping("/employee")
//    public Employee employee(@RequestBody Employee employee) {
//        return employee;
//    }

    @PostMapping("/Login")
    public User user(@RequestBody User user) {
        return user;
    }




}
