package com.jeonghwa.moment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages= {"com.jeonghwa.moment.controller","com.jeonghwa.moment.service"})
@EnableJpaRepositories(basePackages= {"com.jeonghwa.moment.model.dao"})
@EntityScan("model.domain")
public class RecordMomentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordMomentApplication.class, args);
	}

}
