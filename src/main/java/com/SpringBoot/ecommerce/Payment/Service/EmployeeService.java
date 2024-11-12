package com.SpringBoot.ecommerce.Payment.Service;

import com.SpringBoot.ecommerce.Product.Model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> listEmployees();
    Employee nameEmployee(String name);
}
