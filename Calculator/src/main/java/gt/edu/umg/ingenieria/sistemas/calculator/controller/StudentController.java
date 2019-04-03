package gt.edu.umg.ingenieria.sistemas.calculator.controller;

import gt.edu.umg.ingenieria.sistemas.calculator.model.UmgStudentEntity;
import gt.edu.umg.ingenieria.sistemas.calculator.service.UmgStudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private UmgStudentService studentService;

    @GetMapping("/getById")
    public UmgStudentEntity getById(@RequestParam(name = "id", required = true) int id) {
        return this.studentService.getStudentById(id);
    }
    
    @GetMapping("/getByCarnetNumber")
    public UmgStudentEntity getByCarnetNumber(@RequestParam(name = "carnetNumber", required = true) String carnetNumber) {
        return this.studentService.getStudentByCarnetNumber(carnetNumber);
    }
    
    @GetMapping("/getAll")
    public List<UmgStudentEntity> getAll() {
        return this.studentService.getAllStudents();
    }
    
    @PostMapping("/create")
    public UmgStudentEntity create(@RequestBody(required = true) UmgStudentEntity newStudent) {
        return this.studentService.createStudent(newStudent);
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(required = true) int id) {
        this.studentService.deleteStudent(id);
        
        return String.format("El estudiante con id = %d ha sido eliminado del sistema.", id);
    }
    
    @PutMapping("/update/{id}")
    public UmgStudentEntity update(@PathVariable(required = true) int id, @RequestBody(required = true) UmgStudentEntity studentToUpdate) {
        return this.studentService.updateStudent(studentToUpdate);
    }    
    
}
