package br.com.yakuzastudio.springbootdemo.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Kubernetes!";
    }

    @GetMapping("/ola")
    public String hello2() {
        return "Olá Kubernetes!";
    }
}