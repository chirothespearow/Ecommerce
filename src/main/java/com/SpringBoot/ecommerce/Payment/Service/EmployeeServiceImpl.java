package com.SpringBoot.ecommerce.Payment.Service;

import com.SpringBoot.ecommerce.Product.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null ||
        employee.getEmailId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> listEmployees() {
        return employees;
    }

    @Override
    public Employee nameEmployee(String name){
        for(Employee e:employees){
            if(e.getName().equals(name)) return e;
        }
        return null;
    }
}
