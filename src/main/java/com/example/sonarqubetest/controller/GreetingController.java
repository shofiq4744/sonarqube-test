package com.example.sonarqubetest.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class GreetingController {

    @GetMapping("/greeting")
    public String sayHello(@PathVariable String lang, @RequestParam String name){

        String msg = switch (lang) {
            case "fr" -> "Bonjour %s";
            case "de" -> "Willkommen %s";
            case "jp" -> "こんにちは %s";
            default -> "Hello %s";
        };

        return String.format(msg, name);
    }
}
