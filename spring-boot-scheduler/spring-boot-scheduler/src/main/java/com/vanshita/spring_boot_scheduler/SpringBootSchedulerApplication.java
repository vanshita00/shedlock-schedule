package com.vanshita.spring_boot_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulerApplication.class, args);
	}

}
