package com.jsp.assignment10.Driver;

import com.jsp.assignment10.Model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // Load XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("placement-config.xml");

        // Fetch beans
        Student student = context.getBean("student1", Student.class);
        JobRequirement job = context.getBean("job1", JobRequirement.class);
        Application app = context.getBean("application1", Application.class);
        PlacementService placementService = context.getBean("placementService", PlacementService.class);

        // Perform actions
        placementService.applyJob(student, job, app);
        System.out.println("--------------------------------------------------");
        placementService.updateStatus(app, ApplicationStatus.SHORTLISTED);
    }
}