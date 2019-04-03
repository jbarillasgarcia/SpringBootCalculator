package gt.edu.umg.ingenieria.sistemas.calculator.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memory")
public class MemoryController {
    
    private int m;

    @PostMapping("/create")
    public int create(@RequestParam("m") int m) {
        this.m = m;
        
        return this.m;
    }
    
    @GetMapping("/read")
    public int read() {
        return this.m;
    }
    
    @PutMapping("/update")
    public int update(@RequestParam("m") int m) {
        this.m = m;
        return this.m;
    }
    
    @DeleteMapping("/delete")
    public int delete() {
        this.m = 0;        
        return this.m;
    }
    
}
