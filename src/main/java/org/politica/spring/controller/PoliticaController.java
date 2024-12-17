package org.politica.spring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PoliticaController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Ciao, il backend Spring Boot è attivo!";
    }
}
