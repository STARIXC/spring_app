package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.VehicleHire;
@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
