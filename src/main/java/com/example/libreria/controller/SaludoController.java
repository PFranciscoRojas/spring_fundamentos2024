package com.example.libreria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/saludar")
public class SaludoController {
    
    @GetMapping("/recibirsaludo")  
    public String saludo(){
        return "holi :D ";
    }

    @GetMapping("/bye")
    public String despedida() {
        return  "Adioos......";
    }
    
}
