package com.mediflow.department.repository;

import com.mediflow.department.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<department, Long> {
}