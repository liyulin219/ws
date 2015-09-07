package com.atguigu.test;

import javax.xml.ws.Endpoint;

import com.atguigu.ws.impl.HelloWorldWSImpl;

public class TestWS {

	public static void main(String[] args) {
		
		String address = "http://192.168.10.190:8989/WS/hellows";
		
		Endpoint.publish(address, new HelloWorldWSImpl());
		
		System.out.println("发布成功！");
	}
}
