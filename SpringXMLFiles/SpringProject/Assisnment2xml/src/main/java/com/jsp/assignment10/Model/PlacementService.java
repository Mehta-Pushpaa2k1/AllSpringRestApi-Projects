package com.jsp.assignment10.Model;

public class PlacementService {
    private NotificationService notificationService;

    // Setter for XML Dependency Injection
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void applyJob(Student student, JobRequirement job, Application app) {
        app.setStudent(student);
        app.setJobRequirement(job);
        app.setStatus(ApplicationStatus.APPLIED);

        System.out.println(student.getName() + " successfully applied for " + job.getRole() + " at " + job.getCompany().getName());
        notificationService.sendNotification("Application submitted successfully for " + job.getRole());
    }

    public void updateStatus(Application app, ApplicationStatus newStatus) {
        app.setStatus(newStatus);
        System.out.println("Application Status updated to: " + newStatus);
        notificationService.sendNotification("Your application status has been updated to: " + newStatus);
    }
}