package com.example.demopgm1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demopgm1.GreetingService;
@RestController
public class GreetingController {
private final GreetingService greetingService;
@Autowired
public GreetingController(GreetingService greetingService) {
this.greetingService = greetingService;
}
@GetMapping("/greet")
public String greet() {
return greetingService.greet();
}
}