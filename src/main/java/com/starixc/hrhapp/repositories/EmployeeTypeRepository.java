package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.EmployeeType;
@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
