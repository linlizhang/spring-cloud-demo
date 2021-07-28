package com.zhangmagle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient(autoRegister=false)
public class EurekaClientBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientBookApplication.class, args);
	}

}
