package com.ascii274.talentsquad2.service;


import com.ascii274.talentsquad2.domain.Job;
import com.ascii274.talentsquad2.exception.JobNotFoundException;
import com.ascii274.talentsquad2.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImp implements JobService{

    private final JobRepository jobRepository;

    public JobServiceImp(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Job saveJob(Job job) throws JobNotFoundException {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Optional<Job> getJobByJobName(String stringJob) {
        return Optional.empty();
    }

}


