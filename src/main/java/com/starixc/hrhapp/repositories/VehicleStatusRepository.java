package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.VehicleStatus;
@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
