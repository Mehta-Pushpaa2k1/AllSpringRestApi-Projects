package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Office {

    public void principal(Student student){
        System.out.println("I am busy now");
    }
}
