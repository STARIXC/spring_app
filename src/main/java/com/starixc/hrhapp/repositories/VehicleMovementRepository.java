package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.VehicleMovement;
@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
