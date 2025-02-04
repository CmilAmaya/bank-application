package com.bank.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankProjectApplication.class, args);
		BankLogic bankLogic = new BankLogic();
		if(bankLogic.run()) {
			bankLogic.run();
		} else {
			System.exit(0);
		}
	}
}
