package com.Main;

import com.configuration.Config;
import com.entity.Access;
import com.entity.Dao;
import com.entity.Service;
import com.entity.Student;
import com.entity2.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Result {
    public static void main(String[] args) {
      ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);

      Student s = (Student) context.getBean("student");
      s.marks();
      System.out.println(s);

        System.out.println();

        Teacher teach=(Teacher) context.getBean("teacher");
        teach.responsibility();
        System.out.println(teach.getT_name());
        System.out.println(teach.getAge());
        System.out.println(teach.getGender());
        System.out.println();

//      Service ss=(Service) context.getBean("service");
//      ss.saveCar(s);

      Access acc=(Access) context.getBean("access");
      acc.fetch(s);

    }

}
