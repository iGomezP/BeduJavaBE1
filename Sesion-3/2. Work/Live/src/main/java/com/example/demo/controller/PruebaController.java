package com.example.demo.controller;

import com.example.demo.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// indicarle que todos los endpoint comienzan con la misma ruta
@RequestMapping("/prueba")
public class PruebaController {

    // end point
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/goodbye")
    public String goodBye(){
        return "Good Bye!";
    }

    @GetMapping("/curso")
    public Curso enviarCurso(){
        return new Curso(100l, "Backend con Java 1");
    }
}
