package Todoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String hello() {
        return "To-do Application !";
    }

    @GetMapping("/1")
    public String hello1() {
        return "Git is Hard!";
    }
}
