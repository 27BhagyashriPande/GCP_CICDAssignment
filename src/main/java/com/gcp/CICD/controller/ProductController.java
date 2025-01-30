package com.gcp.CICD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@GetMapping("/products")
	public String getProducts() {
		 return "[{\"id\": 1, \"name\": \"Mobiles\"}, " +
				 "{\"id\": 2, \"name\": \"Laptops\"}," +
				 "{\"id\": 3, \"name\": \"Electronics\"}," +
				 "{\"id\": 4, \"name\": \"Telecommunications\"}"
				 + "]";
	}

}
