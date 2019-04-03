package gt.edu.umg.ingenieria.sistemas.calculator.service;

import gt.edu.umg.ingenieria.sistemas.calculator.dao.UmgStudentRepository;
import gt.edu.umg.ingenieria.sistemas.calculator.model.UmgStudentEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmgStudentService {
    
    @Autowired
    private UmgStudentRepository studentRepository;

    public UmgStudentEntity getStudentById(int id) {
        return this.studentRepository.findById(id).get();
    }
    
    public UmgStudentEntity getStudentByCarnetNumber(String carnetNumber) {
        return this.studentRepository.findStudentByCarnetNumber(carnetNumber);
    }
    
    public List<UmgStudentEntity> getAllStudents() {
        return (List<UmgStudentEntity>) this.studentRepository.findAll();
    }
    
    public UmgStudentEntity createStudent(UmgStudentEntity student) {
        return this.studentRepository.save(student);
    }

    public UmgStudentEntity updateStudent(UmgStudentEntity student) {
        return this.studentRepository.save(student);        
    }
    
    public void deleteStudent(int id) {        
        this.studentRepository.deleteById(id);
    }
}
