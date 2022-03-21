package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class JenkinsController {

	
	@GetMapping(path = "/list")
	public String getMessage() {
		
		return "Ram,Wilson,Willy";
	}
	@GetMapping(path="lists/{dept}")
	public String getStudentsByDept(@PathVariable("dept") String dept) {
		
		List<String> list=Arrays.asList("Arun", "Khabib", "Conor");
		
		if(dept.equals("ece")) {
			list = Arrays.asList("Murugan", "Khabib", "Conor");
		}
		return list.toString();
	}
}
