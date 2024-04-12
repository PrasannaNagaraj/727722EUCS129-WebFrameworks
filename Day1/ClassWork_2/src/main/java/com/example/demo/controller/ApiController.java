package main.java.com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/studentName")
    public String getMessage(@RequestParam("name") String a) {
        return "Welcome " + a + "!";
    }
}