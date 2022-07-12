package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
