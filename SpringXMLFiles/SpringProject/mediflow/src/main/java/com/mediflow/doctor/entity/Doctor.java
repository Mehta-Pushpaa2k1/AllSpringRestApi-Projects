package com.mediflow.doctor.entity;

import com.mediflow.department.entity.department;
import jakarta.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String name;

        private String specialization;
        private String email;
        private String phone;
        private Double fees;

        @ManyToOne
        @JoinColumn(name = "department_id")
        private department department;

        public Doctor() {}

        public Doctor(Long id, String name, String specialization, String email, String phone, Double fees, department department) {
                this.id = id;
                this.name = name;
                this.specialization = specialization;
                this.email = email;
                this.phone = phone;
                this.fees = fees;
                this.department = department;
        }

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getSpecialization() { return specialization; }
        public void setSpecialization(String specialization) { this.specialization = specialization; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }

        public Double getFees() { return fees; }
        public void setFees(Double fees) { this.fees = fees; }

        public department getDepartment() { return department; }
        public void setDepartment(department department) { this.department = department; }
}