package com.springboot.dubbo.provider.service.impl;

import com.springboot.dubbo.service.OrderService;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author yangjian
 * @since 17-10-20.
 */
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {

	@Override
	public String orderPay(BigDecimal money) {
		return "From service version 1.0.1, Paid Successfully "+ money;
	}
}
