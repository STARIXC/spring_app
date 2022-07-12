package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
