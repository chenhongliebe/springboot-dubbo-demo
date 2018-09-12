package com.springboot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjian
 * @since 17-10-20.
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Reference(version = "1.0.1")
	private UserService userService;

	@GetMapping(value = "/login")
	public String login() {
		return userService.login("Xiao Ming");
	}
}
