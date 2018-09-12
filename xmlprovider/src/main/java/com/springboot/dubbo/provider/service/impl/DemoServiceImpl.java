package com.springboot.dubbo.provider.service.impl;

import com.springboot.dubbo.service.DemoService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yangjian
 * @since 17-10-20.
 */
@Transactional(rollbackFor = Exception.class)
public class DemoServiceImpl implements DemoService {

	@Override
	public String hello(String name) {
		return "From service version 1.0.1, Hello "+name+"!";
	}
}
