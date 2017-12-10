package com.hotdl.springtutorial;

public class HelloImpl implements HelloApi {

	private String message;

	public HelloImpl() {
		this.message = "hello world";
	}

	public HelloImpl(String message) {
		this.message = message;
	}

	@Override
	public void sayHello() {
		System.out.println(message);
	}

}
