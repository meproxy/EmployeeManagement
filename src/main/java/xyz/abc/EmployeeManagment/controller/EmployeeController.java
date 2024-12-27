package xyz.abc.EmployeeManagment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.abc.EmployeeManagment.model.Employee;
import xyz.abc.EmployeeManagment.service.EmployeeService;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        //log.info("Fetching all employees");
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        //log.info("Getting employee with ID: {}", id);  // Corrected logging format
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        //log.info("Adding new employee: {}", employee.getName());  // Corrected logging format
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        //log.info("Updating employee with ID: {}", id);  // Corrected logging format
        return employeeService.updateEmployee(id, employee);  // Fixed typo
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){  // Change return type to void
        //log.info("Deleting employee with ID: {}", id);  // Corrected logging format
        employeeService.deleteEmployee(id);
    }
}
