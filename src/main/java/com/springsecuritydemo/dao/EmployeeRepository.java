package com.springsecuritydemo.dao;

import com.springsecuritydemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository< Employee, Integer> {

}
