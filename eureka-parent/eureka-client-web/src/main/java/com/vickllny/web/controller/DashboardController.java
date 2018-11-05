/**
 * Package:com.vickllny.web.controller
 * Classname: DashboardController.java
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 5, 2018
 * Time: 5:26:33 PM
 * @author li.lin
 * @version 1.0
 */ 

package com.vickllny.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickllny.eureka.api.DashboardApi;

/**
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 5, 2018
 * Time: 5:26:33 PM
 * @author li.lin
 * @version 1.0
 */
@RestController
public class DashboardController {

	@Autowired
	private DashboardApi dashboardApi;
	
	@RequestMapping("/")
	public String index() {
		return dashboardApi.index();
	}
}
