package com.example.backend.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.modle.Employee;
@Repository 
public interface EmployeeReposistor extends JpaRepository<Employee, Long>{

}
