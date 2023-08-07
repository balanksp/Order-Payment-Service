package com.zaga.PaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @ComponentScan(basePackages = "com.zaga.PaymentService.Service.PaymentDetailService")
public class PaymentServiceUsingUpiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceUsingUpiApplication.class, args);
	}

}
