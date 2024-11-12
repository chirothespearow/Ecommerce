//package com.SpringBoot.ecommerce.Payment.Controller;
//
//import com.SpringBoot.ecommerce.Payment.Service.EmployeeService;
//import com.SpringBoot.ecommerce.Product.Model.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/employee")
//public class EmployeeController {
//    @Autowired
//    public EmployeeService employeeService;
//
//    @PostMapping
//    public Employee save(@RequestBody Employee employee){
//        return employeeService.save(employee);
//    }
//
//    @GetMapping
//    public List<Employee> listEmployees(){
//        return employeeService.listEmployees();
//    }
//
//    @GetMapping("/{name}")
//    public Employee nameEmployee(@PathVariable String name){
//        return employeeService.nameEmployee(name);
//    }
//
//    @DeleteMapping("/{id}")
//    public Employee deleteById(@PathVariable String id){
//        return employeeService.deleteEmployee(id);
//    }
//
//    @PutMapping
//    public Employee changeEmployeeName(@RequestBody Employee employee){
//        return employeeService.changeEmployeeName(employee);
//    }
//}
