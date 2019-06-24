package com.dri.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@RestController
public class ServiceController {

	@Value("${server.port}")
	String port;
	
	@Value("${spring.application.name}")
	String serviceName;

//	@SentinelResource("resource")
	@GetMapping("/get")
	public String query(String param) throws Exception {	
		return serviceName + ":" + port;
	}
	@GetMapping("/get1")
	public String query1(String param) throws Exception {	
		return serviceName + ":" + port;
	}
	@GetMapping("/get2")
	public String query2(String param) throws Exception {	
		return serviceName + ":" + port;
	}
	@GetMapping("/get3")
	public String query3(String param) throws Exception {	
		return serviceName + ":" + port;
	}

}
