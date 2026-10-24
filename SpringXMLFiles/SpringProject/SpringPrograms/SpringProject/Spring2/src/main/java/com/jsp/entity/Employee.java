package com.jsp.entity;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;
    private String ename;
    private double salary;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    private LocalDate dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Designation designation;
}