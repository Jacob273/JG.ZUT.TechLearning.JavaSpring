package edu.zut.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.zut.spring.service.HelloService;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		HelloService hello = ctx.getBean("helloService", HelloService.class);
		
		hello.sayHello();
	}

}
