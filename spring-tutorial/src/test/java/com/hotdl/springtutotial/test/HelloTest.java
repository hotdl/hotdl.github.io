package com.hotdl.springtutotial.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hotdl.springtutorial.HelloApi;

public class HelloTest {
	@Test
	public void testHelloWorld() {
		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloApi helloApi = context.getBean("hello", HelloApi.class);
		helloApi.sayHello();
	}
}
