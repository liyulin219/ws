package com.atguigu.ws.impl;

import javax.jws.WebService;

import com.atguigu.ws.HelloWorldWS;

@WebService
public class HelloWorldWSImpl implements HelloWorldWS {

	public String sayHello(String name) {
		
		System.out.println("hello " + name);
		
		return name;
	}

}
