package com.itpftm.ticketingtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={ "controller", "service"})
@EntityScan(basePackages={"model"})
@EnableJpaRepositories(basePackages={"repository"})
public class TicketingtoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingtoolApplication.class, args);
	}

}
