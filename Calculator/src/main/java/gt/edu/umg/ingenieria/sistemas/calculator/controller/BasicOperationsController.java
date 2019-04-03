package gt.edu.umg.ingenieria.sistemas.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicOperationsController {
    
    private int memoria = 0;

    @GetMapping("/add")
    public int add(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a + b;
    }
    
    @GetMapping("/subs")
    public int subs(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a - b;
    }
    
    @GetMapping("/mul")
    public int mul(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a * b;
    }
    
    @GetMapping("/div")
    public int div(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a / b;
    }
    
}
