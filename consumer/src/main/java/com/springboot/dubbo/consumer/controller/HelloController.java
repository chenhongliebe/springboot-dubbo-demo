package com.springboot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjian
 * @since 17-10-20.
 */
@RestController
public class HelloController {

	@Reference(version = "1.0.0")
	private DemoService demoService;

	@GetMapping(value = "/hello")
	public String index() {
		return demoService.hello("Xiao Ming");
	}
}
