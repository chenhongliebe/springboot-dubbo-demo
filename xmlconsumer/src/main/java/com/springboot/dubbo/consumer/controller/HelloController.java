package com.springboot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.service.DemoService;
import com.springboot.dubbo.service.OrderService;
import com.springboot.dubbo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author yangjian
 * @since 17-10-20.
 */
@RestController
public class HelloController {

	@Reference(version = "1.0.1")
	private DemoService demoService;

	@Reference(version = "1.0.1")
	private UserService userService;

	@Reference(version = "1.0.1")
	private OrderService orderService;

	@GetMapping(value = "/hello")
	public String index() {

		return demoService.hello("Xiao Ming");
	}

	@GetMapping(value = "/login")
	public String login() {
		return userService.login("坚强的馒头");
	}

	@GetMapping(value = "/pay")
	public String pay() {
		BigDecimal bigDecimal = new BigDecimal("123456.12");
		return orderService.orderPay(bigDecimal);
	}

	@GetMapping(value = "/test")
	public String test() {
		return userService.test("坚强的馒头");
	}
}
