package gt.edu.umg.ingenieria.sistemas.calculator.dao;

import gt.edu.umg.ingenieria.sistemas.calculator.model.UmgStudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmgStudentRepository extends CrudRepository<UmgStudentEntity, Integer>{
        
    public UmgStudentEntity findStudentByCarnetNumber(String carnetNumber);
    
}
