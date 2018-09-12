package com.springboot.dubbo.provider.service.impl;

import com.springboot.dubbo.provider.domain.OrderInfo;
import com.springboot.dubbo.provider.domain.OrderRepository;
import com.springboot.dubbo.provider.domain.User;
import com.springboot.dubbo.provider.domain.UserRepository;
import com.springboot.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author yangjian
 * @since 17-10-20.
 */
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public String login(String username) {

		User user = new User();
		user.setUserName("xiaoyang222");
		user.setPassWord("123456");
		user.setEmail("11232422@qq.com");
		user.setRegTime("2017-11-24");
		User save = userRepository.save(user);

		//inser orderInfo
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setOrderNo(UUID.randomUUID().toString());
		orderInfo.setUserId(save.getId());
		if (orderRepository.save(orderInfo) == null) {
			throw new RuntimeException();
		}
		return "From service version 1.0.1, Login Success "+username;
	}

	@Override
	public String test(String username) {
		System.out.println("调用成功："+username);
		return username;
	}
}
