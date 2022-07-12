package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.VehicleModel;
@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
