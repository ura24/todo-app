package com.example.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

  @GetMapping("")
  public String index(Model model) {
    model.addAttribute("hello", "Hello, World!");
    return "hello-world";
  }
}
