package com.example.ziraticket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
//@EnableEurekaClient
@MapperScan(basePackages = "com.example.ziraticket.dao")
public class ZiraTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZiraTicketApplication.class, args);
	}

}
