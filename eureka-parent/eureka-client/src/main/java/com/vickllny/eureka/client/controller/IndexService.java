/**
 * Package:com.vickllny.eureka.client.controller
 * Classname: IndexService.java
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 5, 2018
 * Time: 5:03:15 PM
 * @author li.lin
 * @version 1.0
 */ 

package com.vickllny.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vickllny.eureka.client.utils.SpringContextUtil;

/**
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 5, 2018
 * Time: 5:03:15 PM
 * @author li.lin
 * @version 1.0
 */
@RestController
@RequestMapping
public class IndexService{

	@Autowired
	private SpringContextUtil springContextUtil;
	
	@RequestMapping(value = "index",method = RequestMethod.GET)
	public String index() {
		return "the active profile is:" + springContextUtil.getActiveProfile();
	}

}
