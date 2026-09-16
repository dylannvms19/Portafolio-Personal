package com.moragrega.MiPrimerServidorWeb;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //https://MiPagina.com/api
public class HelloController {

    // GET https://MiPagina.com/api
    @GetMapping("/hello")
    public String hello(){
        return "Hola desde mi primer servidor";
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola desde el servidor de " +nombre;
    }

    @PostMapping("/mensaje")
    public String mensaje(@RequestBody String texto) {
        return "Mensaje recibido: " + texto;
    }
}
