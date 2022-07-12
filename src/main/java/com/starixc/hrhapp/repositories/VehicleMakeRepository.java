package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.VehicleMake;
@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
