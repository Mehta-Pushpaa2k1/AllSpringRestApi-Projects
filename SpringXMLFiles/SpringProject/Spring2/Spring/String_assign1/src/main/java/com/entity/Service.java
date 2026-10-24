package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.Principal;

@Component
public class Service {
@Autowired
    Dao dao;

//    public Service( @Autowired Dao dao) {
//        this.dao = dao;
//    }

    public void saveCar(Student student){
      dao.save(student);
    }

}
