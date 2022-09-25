package com.ascii274.talentsquad2.controller;


import com.ascii274.talentsquad2.domain.Job;
import com.ascii274.talentsquad2.exception.JobNotFoundException;
import com.ascii274.talentsquad2.repository.JobRepository;
import com.ascii274.talentsquad2.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("talent-squad")
public class JobController {


    @Autowired
    JobService jobService;

    @GetMapping("/test")
    public String test(){
        return "Hello search controller";
    }

    @PostMapping("/create-job")
    public ResponseEntity<?> createJob(@RequestBody Job job) throws JobNotFoundException {
        Job newJob =  jobService.saveJob(job);
        return ResponseEntity.status(200).body(newJob);
    }

    @GetMapping("/getall-jobs")

    public ResponseEntity<?> getAllJobs(){
        List<Job> jobList = jobService.getAllJobs();
        return ResponseEntity.status(200).body(jobList);
    }
}
