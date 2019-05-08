package com.capgemini.spring.mvc.controller;

public class HelloContoller {

	

		@RequestMapping("/hello")
		public String sayHello() {
			return "Hello";
			
		}

}
