package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.bean.Address;


@Configuration
public class AddressConfig {
@Bean("demo2")
	public Address getMyAddress() {
		return new Address();
	}
	}
	

