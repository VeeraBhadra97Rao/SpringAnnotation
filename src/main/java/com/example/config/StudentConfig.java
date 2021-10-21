package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.bean.Student;

@Configuration
public class StudentConfig {
@Bean("demo1")
public Student getMyName() {
	return new Student();
}
}
