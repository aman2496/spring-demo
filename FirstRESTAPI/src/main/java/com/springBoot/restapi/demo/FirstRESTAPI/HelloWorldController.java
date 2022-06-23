package com.springBoot.restapi.demo.FirstRESTAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* 
 	@Controller annotation is used to make class a Spring MVC class to handle the web requests.
 	
 	@ResponseBody annotation is uses HTTPMessage converters to convert the return value to HTTPResponse body (JSON, etc.)
 	
 	@RestController annotation can be used as well which is combination of @Controller + @ResponseBody annotations.
*/

@RestController
public class HelloWorldController {
	
	// @GetMapping annotation handles the GET method type
	// http://localhost:8080/greet
	
	@GetMapping("/greet")
	public String greetings() {
		return "Hello World!";
	}

}
