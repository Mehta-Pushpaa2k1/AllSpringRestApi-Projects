package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Dao {

    @Autowired
    Access acc;

    @Autowired
     @Qualifier(value ="Child2")
    Parent p;

public void save( Student student){
acc.fetch(student);
    p.sum();

}
public void delete(){
    System.out.println("delete car");
}
}
