package gt.edu.umg.ingenieria.sistemas.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvancedOperationsController {

    @GetMapping("/advanced/abs")
    public int abs(@RequestParam(name = "n") int n) {
        return Math.abs(n);
    }
    
    @GetMapping("/advanced/sqrt")
    public double sqrt(@RequestParam(name = "n") double n) {
        return Math.sqrt(n);
    }
    
}
