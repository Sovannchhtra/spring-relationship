package com.spring.boot.spring_relationship.repository;

import com.spring.boot.spring_relationship.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
