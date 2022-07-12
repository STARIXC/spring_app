package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.JobTitle;
@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
