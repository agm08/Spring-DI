package com.demo.Spring.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

//		This line, will tell the compiler to return an object of the customer class.
//		If the Bean is available, then the Spring framework is injecting the customer object in your application.
//		So, basically, this object is created by the Spring framework, which can be further used in the application.
//		This is field injection since the dependency of technology object is injected directly into the Student class.

		Technologies technologies = new Technologies();

		Manager manager = new Manager(technologies);

		manager = context.getBean(Manager.class);
		manager.display();

		Student a = context.getBean(Student.class);
		a.display();

		Employee b = context.getBean(Employee.class);
		b.display();
//		Student b = context.getBean(Student.class);
//		b.display();
	}

}
