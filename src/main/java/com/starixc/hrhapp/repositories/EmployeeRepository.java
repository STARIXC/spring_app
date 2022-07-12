package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
