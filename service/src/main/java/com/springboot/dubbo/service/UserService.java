package com.springboot.dubbo.service;

/**
 * @author yangjian
 * @since 17-10-27.
 */
public interface UserService {

	/**
	 * 用户登录
	 * @param username
	 * @return
	 */
	String login(String username);

	String test(String username);
}
