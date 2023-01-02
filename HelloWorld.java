package com.gl.SpringbootHelloWorld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {
	@RequestMapping("/helloWorld")
	public String SayHello() {

		return "HelloWorld!!";
	}

}
