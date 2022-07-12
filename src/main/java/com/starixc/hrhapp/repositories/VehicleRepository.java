package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
