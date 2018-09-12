package com.springboot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.service.DemoService;

/**
 * @author yangjian
 * @since 17-10-20.
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

	@Override
	public String hello(String name) {
		return "From Spring-Boot-Starter Provider, Hello "+name+", Fuck it whatever!";
	}
}
