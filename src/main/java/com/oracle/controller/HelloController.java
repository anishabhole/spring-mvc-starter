package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	// URL: http://localhost:8080/spring-mvc/sayHello.do
	@GetMapping(path = "/sayHello.do")
	public String sayHello() {
		return "hello";  // maps to hello.jsp
	}
}

