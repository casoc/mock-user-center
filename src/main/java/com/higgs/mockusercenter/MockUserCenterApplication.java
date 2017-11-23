package com.higgs.mockusercenter;

import org.bytesoft.bytetcc.supports.springcloud.config.SpringCloudConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ImportResource({ "classpath:bytetcc-supports-springcloud.xml" })
@Import(SpringCloudConfiguration.class)
@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories
@EnableCircuitBreaker
@EnableHystrix
public class MockUserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockUserCenterApplication.class, args);
	}
}
