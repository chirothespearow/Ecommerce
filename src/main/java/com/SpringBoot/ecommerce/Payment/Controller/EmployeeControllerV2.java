package com.SpringBoot.ecommerce.Payment.Controller;

import com.SpringBoot.ecommerce.Payment.Service.EmployeeService;
import com.SpringBoot.ecommerce.Product.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2/employees")
public class EmployeeControllerV2 {

//    @Qualifier("EmployeeV2ServiceImpl")
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

}
