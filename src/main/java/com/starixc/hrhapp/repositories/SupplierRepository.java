package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
