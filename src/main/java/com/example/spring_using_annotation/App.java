package com.example.spring_using_annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.bean.Address;
import com.example.bean.Student;
import com.example.config.AppConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student obj1 = (Student)context.getBean("demo1");
		obj1.myName();
		Address obj2 = (Address)context.getBean("demo2");
		obj2.myAddress();

	}

}
