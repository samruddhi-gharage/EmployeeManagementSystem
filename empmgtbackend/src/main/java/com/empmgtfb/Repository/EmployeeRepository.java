package com.empmgtfb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empmgtfb.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
