package com.higgs.mockusercenter;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath:bytetcc-supports-springcloud.xml", "classpath:spring-mybatis.xml" })
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.higgs.mockusercenter")
public class MockUserCenterApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MockUserCenterApplication.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
	}
}
