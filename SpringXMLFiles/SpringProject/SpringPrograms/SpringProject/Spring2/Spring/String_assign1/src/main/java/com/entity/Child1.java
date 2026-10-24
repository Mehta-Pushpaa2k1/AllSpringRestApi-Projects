package com.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Child1 implements Parent {

    @Override
    public void sum(){
        System.out.println("I am child1 class method");
    }

}
