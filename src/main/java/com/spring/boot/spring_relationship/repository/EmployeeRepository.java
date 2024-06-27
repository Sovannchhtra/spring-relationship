package com.spring.boot.spring_relationship.repository;

import com.spring.boot.spring_relationship.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
