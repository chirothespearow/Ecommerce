//package com.SpringBoot.ecommerce.Payment.Service;
//
//import com.SpringBoot.ecommerce.Payment.Error.EmployeeNotFoundException;
//import com.SpringBoot.ecommerce.Product.Model.Employee;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
import java.util.UUID;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService{
//
//    List<Employee> employees = new ArrayList<>();
//    @Override
//    public Employee save(Employee employee) {
//        if(employee.getEmployeeId() == null ||
//        employee.getEmailId().isEmpty()){
//            employee.setEmployeeId(UUID.randomUUID().toString());
//        }
//        employees.add(employee);
//        return employee;
//    }
//
//    @Override
//    public List<Employee> listEmployees() {
//        return employees;
//    }
//
//    @Override
//    public Employee nameEmployee(String name) throws EmployeeNotFoundException {
//        for(Employee e:employees){
//            if(e.getName().equals(name)) return e;
//        }
//        throw new EmployeeNotFoundException("Employee with name "+name+" not found");
//    }
//
//    @Override
//    public Employee deleteEmployee(String employeeId) {
//        Employee employee = employees.stream()
//                .filter(e-> e.getEmployeeId().equalsIgnoreCase(employeeId))
//                .findFirst()
//                .get();
//        employees.remove(employee);
//        return employee;
//    }
//
//    @Override
//    public Employee changeEmployeeName(Employee employee) {
//        Employee oldEmployee = employees.stream()
//                .filter(e -> e.getEmployeeId().equalsIgnoreCase(employee.getEmployeeId()))
//                .findFirst()
//                .get();
//        oldEmployee.setName(employee.getName());
//        return oldEmployee;
//    }
//}
////                .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID "+employee.getEmployeeId()+" not found")
