package com.market.Ecomerce_Market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoControler {
    @GetMapping("/hola")
    public String Saludar(){
        return "Nunca pares de aprender";
    }
}
