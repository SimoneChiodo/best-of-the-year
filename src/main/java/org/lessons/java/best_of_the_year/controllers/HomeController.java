package org.lessons.java.best_of_the_year.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

  //Index
  @GetMapping
  public String getMethodName(@RequestParam String param, Model model) {
    model.addAttribute("nome", "Simone");

    return "index";
  }

}
