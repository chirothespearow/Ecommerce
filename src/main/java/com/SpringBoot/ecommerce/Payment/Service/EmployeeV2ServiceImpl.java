package com.SpringBoot.ecommerce.Payment.Service;

import com.SpringBoot.ecommerce.Payment.Entity.EmployeeEntity;
import com.SpringBoot.ecommerce.Payment.Repository.EmployeeRepository;
import com.SpringBoot.ecommerce.Product.Model.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null ||
                employee.getEmailId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,entity);
        employeeRepository.save(entity);
        return employee;
    }

    @Override
    public List<Employee> listEmployees() {
        return List.of();
    }

    @Override
    public Employee nameEmployee(String name) {
        return null;
    }

    @Override
    public Employee deleteEmployee(String employeeId) {
        return null;
    }

    @Override
    public Employee changeEmployeeName(Employee employee) {
        return null;
    }
}
