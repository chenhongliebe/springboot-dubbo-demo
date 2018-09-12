package com.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author
 */
@SpringBootApplication
@ImportResource(value = "classpath:dubbo-demo-consumer.xml")
public class XmlconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlconsumerApplication.class, args);
	}
}
