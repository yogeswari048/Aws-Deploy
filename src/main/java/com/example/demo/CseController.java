package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
   @GetMapping("/home")
   public String disk() {
	   return "Welcome to CSE Jenkins";
   }
   
   @GetMapping("/cse")
   public String cse() {
	   return "Welcome to Aditya University";
   }
}