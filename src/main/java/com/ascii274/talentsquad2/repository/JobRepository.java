package com.ascii274.talentsquad2.repository;

import com.ascii274.talentsquad2.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {


}
