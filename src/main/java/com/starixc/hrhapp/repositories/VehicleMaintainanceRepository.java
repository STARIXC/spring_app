package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starixc.hrhapp.models.Client;

public interface VehicleMaintainanceRepository extends JpaRepository<Client, Integer> {

}
