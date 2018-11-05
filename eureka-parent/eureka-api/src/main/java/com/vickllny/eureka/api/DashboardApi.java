/**
 * Package:com.vickllny.eureka.api
 * Classname: DashboardApi.java
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 5, 2018
 * Time: 4:57:23 PM
 * @author li.lin
 * @version 1.0
 */ 

package com.vickllny.eureka.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 5, 2018
 * Time: 4:57:23 PM
 * @author li.lin
 * @version 1.0
 */
@FeignClient(value = "hello-service")
public interface DashboardApi {
	
	@RequestMapping(value = "index",method= RequestMethod.GET)
	String index();
}
