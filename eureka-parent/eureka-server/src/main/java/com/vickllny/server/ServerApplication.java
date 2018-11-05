/**
 * Package:com.vickllny.server
 * Classname: ServerApplication.java
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 2, 2018
 * Time: 3:58:58 PM
 * @author li.lin
 * @version 1.0
 */ 

package com.vickllny.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 2, 2018
 * Time: 3:58:58 PM
 * @author li.lin
 * @version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
