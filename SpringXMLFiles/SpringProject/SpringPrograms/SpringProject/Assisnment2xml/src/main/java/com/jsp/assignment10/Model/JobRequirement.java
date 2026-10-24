package com.jsp.assignment10.Model;

public class JobRequirement {
    private String jobId;
    private Company company;
    private String role;

    // Getters and Setters
    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}