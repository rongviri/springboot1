package com.example.springboot1;

public class WelcomeBean {
    private String message;

     public WelcomeBean(String message) {
       super();
       this.message = message;
     }

    public String getMessage() {
      return message;
    }
  }