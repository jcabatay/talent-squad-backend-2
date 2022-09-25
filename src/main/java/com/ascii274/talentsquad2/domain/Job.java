package com.ascii274.talentsquad2.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name="jobs")
public class Job {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "job_name")
    private String job_name;
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "job_description")
    private String job_description;
    @Column(name = "skills")
    private String skills;
    @Column(name = "company_sector")
    private String company_sector;
    @Column(name = "kind_of_job")
    private String kind_of_job;
    @Column(name = "localization")
    private String localization;
    @Column(name = "other_info")
    private String other_info;


}
