package com.jsp.assignment10.Model;

public class Application {
    private String appId;
    private Student student;
    private JobRequirement jobRequirement;
    private ApplicationStatus status;

    // Getters and Setters
    public String getAppId() {
        return appId; }
    public void setAppId(String appId) {
        this.appId = appId; }

    public Student getStudent() {
        return student; }
    public void setStudent(Student student) {
        this.student = student; }

    public JobRequirement getJobRequirement() {
        return jobRequirement; }
    public void setJobRequirement(JobRequirement jobRequirement) { this.jobRequirement = jobRequirement; }

    public ApplicationStatus getStatus() {
        return status; }
    public void setStatus(ApplicationStatus status) {
        this.status = status; }
}