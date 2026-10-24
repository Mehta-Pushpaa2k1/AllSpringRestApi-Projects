package com.jsp.assignment7.Model;
import java.util.List;

public class College {
    private String collegeName;
    private Principal principal; // Refers to com.jsp.assignment7.Model.Principal
    private List<Student> students;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}