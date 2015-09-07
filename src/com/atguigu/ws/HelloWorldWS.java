package com.atguigu.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorldWS {

	@WebMethod
	public String sayHello(String name);
}
