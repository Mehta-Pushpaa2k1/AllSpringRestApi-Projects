package com.spring.q5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private NotificationService notificationService;

    public void saveEmployee() {

        employeeRepository.saveEmployee();

        emailService.sendEmail();

        notificationService.sendNotification();
    }
}