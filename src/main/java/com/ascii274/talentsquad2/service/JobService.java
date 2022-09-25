package com.ascii274.talentsquad2.service;

import com.ascii274.talentsquad2.domain.Job;
import com.ascii274.talentsquad2.exception.JobNotFoundException;

import java.util.List;
import java.util.Optional;

public interface JobService{
    Job saveJob(Job job) throws JobNotFoundException;
    List<Job> getAllJobs();
    Optional<Job> getJobByJobName(String stringJob);
}
