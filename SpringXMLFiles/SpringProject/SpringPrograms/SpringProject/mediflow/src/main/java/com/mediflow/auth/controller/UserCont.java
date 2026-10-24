package com.mediflow.auth.controller;

import com.mediflow.auth.entity.User;
import com.mediflow.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class UserCont {

    private  final UserService userService;

    @GetMapping("/mee")
    public ResponseEntity<User> me(Authentication authentication){

        String username=authentication.getName();
        System.out.println(username);
        User user= userService.loadUserByEmail(username);
        return ResponseEntity.ok(user);
    }
}
