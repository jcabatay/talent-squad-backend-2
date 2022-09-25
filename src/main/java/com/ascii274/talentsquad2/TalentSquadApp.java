package com.ascii274.talentsquad2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@EnableConfigurationProperties
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan ({"com.ascii274.talentsquad2.repository.JobRepository"})
//@EnableJpaRepositories("com.ascii274.repository")

public class TalentSquadApp {

	public static void main(String[] args) {
		SpringApplication.run(TalentSquadApp.class, args);
	}


}
