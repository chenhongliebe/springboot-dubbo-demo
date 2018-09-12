package com.springboot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.service.OrderService;

import java.math.BigDecimal;

/**
 * @author yangjian
 * @since 17-10-27.
 */
@Service(version = "1.0.0")
public class OrderServiceImpl implements OrderService {
	@Override
	public String orderPay(BigDecimal money) {
		return "Paid Successfully "+ money;
	}
}
