package gt.edu.umg.ingenieria.sistemas.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicOperationsController {
    
    private int memoria = 0;

    @GetMapping("/sumar")
    public int sumar(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a + b;
    }
    
    @PostMapping("/guardar")
    public int guardar(@RequestParam(name = "m", required = true) int m) {
        this.memoria = m;
        
        return this.memoria;
    }
    
    @GetMapping("/recuperar")
    public int recuperar() {
        return this.memoria;
    }
}
