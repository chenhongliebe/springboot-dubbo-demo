package com.springboot.dubbo.provider.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yangjian
 */
public interface OrderRepository extends JpaRepository<OrderInfo, Long> {
    
}