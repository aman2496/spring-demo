package com.springBoot.restapi.demo.FirstRESTAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Aman", "Jain");
	}
	
	@GetMapping("/student/{fName}/{lName}")
	public Student getStudentPathVariable(@PathVariable("fName") String firstName, @PathVariable("lName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	@GetMapping("/student/queryParams")
	public Student getStudentReqParams(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
		return new Student(firstName, lastName);
	}

}
