package com.springboot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.service.UserService;

/**
 * @author yangjian
 * @since 17-10-27.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
	@Override
	public String login(String username) {
		return username+" Login Success.";
	}
}
