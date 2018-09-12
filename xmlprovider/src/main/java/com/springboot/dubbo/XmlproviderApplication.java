package com.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yangjian
 */
@SpringBootApplication
@ImportResource(value = "classpath:dubbo-demo-provider.xml")
public class XmlproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlproviderApplication.class, args);
	}
}
