
package fr.m2i.javaspring.service;

import fr.m2i.javaspring.model.Employee;
import fr.m2i.javaspring.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    
    private final EmployeeRepository repo;
    
    @Autowired  // annotation optionnal sur le constructeur  // pou injection de dépendance
    public EmployeeService(EmployeeRepository repo){
        this.repo =repo;
    }
    
    public List<Employee> findAll(){
        return repo.findAll();
    }
    
}
