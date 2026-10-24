package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Access {
    @Autowired
    Dao dao;
    @Autowired
    Service ser;
    public void fetch(Student student){
        System.out.println("Fetch all data from here");
        dao.save(student);
        ser.saveCar(student);
        dao.delete();
    }

}
