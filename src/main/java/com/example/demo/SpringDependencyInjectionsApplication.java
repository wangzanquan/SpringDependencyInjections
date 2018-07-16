package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.config.ApplicationConfig;
import com.example.model.Company;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.model")
public class SpringDependencyInjectionsApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Company comp = context.getBean(Company.class);
		comp.showEmployeeInfo();
		comp.showDepartmentInfo();
		
		context.close();
		
	}
}
