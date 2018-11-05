/**
 * Package:com.vickllny.web
 * Classname: Application.java
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 5, 2018
 * Time: 5:25:00 PM
 * @author li.lin
 * @version 1.0
 */ 

package com.vickllny.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 5, 2018
 * Time: 5:25:00 PM
 * @author li.lin
 * @version 1.0
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.vickllny")
@EnableFeignClients("com.vickllny")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
