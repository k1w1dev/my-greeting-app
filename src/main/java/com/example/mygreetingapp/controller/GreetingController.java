package com.example.mygreetingapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @GetMapping("/hello")
  @ResponseBody
  public ResponseEntity<String> hello() {
    return new ResponseEntity<>("Hello", HttpStatus.OK);

  }
}