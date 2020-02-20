package com.webcore.app.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MasterServiceZullServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterServiceZullServerApplication.class, args);
	}

}
