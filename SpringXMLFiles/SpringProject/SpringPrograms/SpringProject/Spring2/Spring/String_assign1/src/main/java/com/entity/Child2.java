package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Child2  implements Parent{
@Override
    public void sum(){
    System.out.println("I am child2 class method");
}
}
