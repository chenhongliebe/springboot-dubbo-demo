package com.springboot.dubbo.service;

import java.math.BigDecimal;

/**
 * @author yangjian
 * @since 17-10-27.
 */
public interface OrderService {

	/**
	 * 订单支付服务
	 * @param money
	 * @return
	 */
	String orderPay(BigDecimal money);
}
