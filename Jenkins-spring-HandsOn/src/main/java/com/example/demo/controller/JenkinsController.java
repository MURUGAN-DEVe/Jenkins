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
		System.out.println("Git");
		if(dept.equals("ece")) {
			list = Arrays.asList("Murugan", "Kabilan", "Conor");
		}
		System.out.println("Thank You");
		System.out.println("Thank You");
		return list.toString();
	}
}
