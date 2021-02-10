package com.github.antonioticelso.sandbox_sp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMessage() {
        return "Hello o Messanger depois do carrinho!";
    }
}
