package com.example.demo.apis;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/test")
    public String Test() {
        return "Message From Docker";
    }
}
