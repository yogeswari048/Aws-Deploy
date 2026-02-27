package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
   @GetMapping("/home")
   public String disk() {
	   return "Designed by 23MH1A05P4";
   }
   
   @GetMapping("/cse")
   public String cse() {
	   return "Welcome to Aditya University";
   }
}