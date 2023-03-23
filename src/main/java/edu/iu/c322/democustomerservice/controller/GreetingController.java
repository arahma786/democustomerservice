package edu.iu.c322.democustomerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class GreetingController {
   @GetMapping()
   public String greeting(){
      return "Greetings";
   }
}
