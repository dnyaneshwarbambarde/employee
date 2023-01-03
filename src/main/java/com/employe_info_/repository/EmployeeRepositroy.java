package com.employe_info_.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employe_info_.entity.Employee;

public interface EmployeeRepositroy extends JpaRepository<Employee, Long> {

}
