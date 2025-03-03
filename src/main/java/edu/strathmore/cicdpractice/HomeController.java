package edu.strathmore.cicdpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String homepage(){

        System.out.println(" ----> Home page <-------");
        return "Hello from homepage";
    }
}
